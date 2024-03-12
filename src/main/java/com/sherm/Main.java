package com.sherm;

import com.sherm.commands.Ping;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    public static void main(String[] args) {
        JDA jda = JDABuilder.createDefault(Token.token).enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
        jda.getPresence().setActivity(Activity.playing("Ahoj!"));
        jda.addEventListener(new Listeners());
        jda.addEventListener(new Ping());
    }
}
