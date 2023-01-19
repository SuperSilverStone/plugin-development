package me.supersilverstone.plugintutorial;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getPluginManager().registerEvents(new events(), this);
        Bukkit.getPluginManager().registerEvents(new playerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
