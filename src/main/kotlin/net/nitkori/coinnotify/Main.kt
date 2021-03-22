package net.nitkori.coinnotify

import com.google.gson.Gson
import io.reactivex.rxjava3.schedulers.Schedulers
import net.dv8tion.jda.api.JDA
import net.nitkori.coinnotify.discord.CommentReceiveAdapter
import net.nitkori.coinnotify.credential.BotCredential
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.PrivateChannel
import net.dv8tion.jda.api.utils.Compression
import net.dv8tion.jda.api.utils.cache.CacheFlag
import net.nitkori.coinnotify.api.CoinOneApiClient
import java.util.concurrent.TimeUnit

class Main {
    companion object {

        private lateinit var jda: JDA

        @JvmStatic
        fun main(args: Array<String>) {
            initialize()

            CoinOneApiClient().api.showList().subscribeOn(Schedulers.io())
                .delay(10, TimeUnit.SECONDS)
                .repeat().subscribe({
                    jda.retrieveUserById(717955407183609898).queue { user ->
                        user.openPrivateChannel().queue { channel: PrivateChannel ->
                            channel.sendMessage("MBL Price : " + it[0].getTradePrice().toString()).queue()
                            println("MBL Price : " + it[0].getTradePrice())
                        }
                    }
                }, {
                    println(it.message)
                })
        }

        private fun initialize() {
            jda = JDABuilder.createDefault(BotCredential.getToken())
                .disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE)
                .setBulkDeleteSplittingEnabled(false)
                .setCompression(Compression.NONE)
                .addEventListeners(CommentReceiveAdapter())
                .build()
        }
    }
}