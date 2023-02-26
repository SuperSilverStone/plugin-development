package me.supersilverstone.plugintutorial.episode4;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class feed implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (command.getName().equalsIgnoreCase("feed")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setFoodLevel(20);
            }
        }

        return true;
    }
}
