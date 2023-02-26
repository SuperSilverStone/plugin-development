package me.supersilverstone.plugintutorial.episode5;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class message implements CommandExecutor {
    @Override
    @Deprecated
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("message")) {
            if (sender instanceof Player) {
                if (!args[0].isEmpty() && !args[1].isEmpty()) {
                    String word = args[0];
                    String receiver = args[1];
                    for (Player onlinePlayers : Bukkit.getOnlinePlayers()) {
                        if (onlinePlayers.getDisplayName().equals(receiver)) {
                            Player receiverPlayer = Bukkit.getServer().getPlayer(receiver);
                            receiverPlayer.sendMessage(ChatColor.GREEN + word);
                        } else {
                            sender.sendMessage(ChatColor.RED + receiver + " does not exist.");
                            sender.sendMessage(ChatColor.RED + "Please try /message <word> <player>.");
                        }
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "Unknown arguments.");
                    sender.sendMessage(ChatColor.RED + "Please try /message <word> <player>.");
                }
            }
        }
        return true;
    }
}
