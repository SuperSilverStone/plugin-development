// This is the MAIN class for the plugin.
// Every episode will have this file,
// however, it will have additional code in it everytime
// from the previous episode. So, be careful!

package me.supersilverstone.plugintutorial;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
