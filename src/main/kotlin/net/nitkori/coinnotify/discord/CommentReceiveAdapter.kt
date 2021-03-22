package net.nitkori.coinnotify.discord

import net.dv8tion.jda.api.entities.*
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class CommentReceiveAdapter : ListenerAdapter() {

    override fun onMessageReceived(event: MessageReceivedEvent) {
        val user: User = event.author
        val cnl: MessageChannel = event.channel
        val msg: Message = event.message

        if (user.isBot) return
        if (msg.contentRaw == "!btc") {
            user.openPrivateChannel().queue { channel: PrivateChannel ->
                channel.sendMessage("좆까! " + user.asMention).queue()
            }
            println(user)
            cnl.sendMessage("좆까! " + user.asMention).queue { response: Message ->
//                response.editMessageFormat("Pong: %d ms", System.currentTimeMillis() - time).queue()
            }
        }
    }
}