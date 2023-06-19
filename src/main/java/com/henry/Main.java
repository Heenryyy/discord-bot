package com.henry;

import com.henry.commands.CarsCommand;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();
        String token = dotenv.get("TOKEN");
        JDA bot = JDABuilder.createDefault(token, GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS)
                .setActivity(Activity.playing("Cars 2 - Das Spiel"))
                .build();

        bot.addEventListener(new CarsCommand());
    }
}
