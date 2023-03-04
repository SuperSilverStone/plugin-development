package me.supersilverstone.plugintutorial;

import me.supersilverstone.plugintutorial.episode2.events;
import me.supersilverstone.plugintutorial.episode3.playerListener;
import me.supersilverstone.plugintutorial.episode4.feed;
import me.supersilverstone.plugintutorial.episode5.message;
import me.supersilverstone.plugintutorial.episode6.coinflip;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        // Episode 1
        // N/A

        // Episode 2
        Bukkit.getPluginManager().registerEvents(new events(), this);

        // Episode 3
        Bukkit.getPluginManager().registerEvents(new playerListener(), this);

        // Episode 4
        getCommand("feed").setExecutor(new feed());

        // Episode 5
        getCommand("message").setExecutor(new message());

        // Episode 6
        getCommand("coinflip").setExecutor(new coinflip());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
