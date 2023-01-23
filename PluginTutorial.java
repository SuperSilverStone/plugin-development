package me.supersilverstone.plugintutorial;

import me.supersilverstone.plugintutorial.episode2.events;
import me.supersilverstone.plugintutorial.episode3.playerListener;
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
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
