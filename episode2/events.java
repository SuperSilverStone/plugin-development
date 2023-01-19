package me.supersilverstone.plugintutorial;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class events implements Listener {

    @EventHandler
    public void OnBlockBreak(BlockBreakEvent event) {
        if (event.getPlayer() != null) {
            Player player = event.getPlayer();

            player.sendMessage("Block Broken!");
        }
    }

    @EventHandler
    public void OnEat(PlayerItemConsumeEvent event) {
        if (event.getItem().getType().equals(Material.COOKED_BEEF)) {
            if (event.getPlayer() != null) {
                Player player = event.getPlayer();
                player.sendMessage("ATE COOKED BEEF!");
            } return;
        } return;
    }

}
