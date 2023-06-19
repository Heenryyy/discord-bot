package com.henry.commands;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.swing.text.StringContent;

public class CarsCommand extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        if (event.getAuthor().isBot())
            return;

        Message msg = event.getMessage();
        String content = msg.getContentRaw();

        if (content.equalsIgnoreCase("!Cars")){
            MessageChannel messageChannel = event.getChannel();
            messageChannel.sendMessage("Ka-Chow").queue();
        }
    }
}
