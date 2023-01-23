package me.supersilverstone.plugintutorial.episode3;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class playerListener implements Listener {

    @EventHandler
    @Deprecated
    public void OnPlayerJoin(PlayerJoinEvent event) {
        if (event.getPlayer() != null) {
            Player player = event.getPlayer();
            event.setJoinMessage(ChatColor.YELLOW + "Herobrine joined the game");
        }
    }

    @EventHandler
    @Deprecated
    public void OnPlayerLeave(PlayerQuitEvent event) {
        if (event.getPlayer() != null) {
            Player player = event.getPlayer();
            event.setQuitMessage(ChatColor.YELLOW + "Herobrine left the game");
        }
    }

}
