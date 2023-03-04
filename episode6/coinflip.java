package me.supersilverstone.plugintutorial.episode6;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class coinflip implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            int random = getRandomInt(2);
            System.out.println(random);
            String output = null;

            if (random == 0) {
                output = "Heads!";
            } else if (random == 1) {
                output = "Tails!";
            }

            player.sendMessage(ChatColor.GREEN + "You Rolled " + output);
        }
        return true;
    }

    public static Integer getRandomInt(Integer max) {
        Random ran = new Random();
        return ran.nextInt(max);
    }
}
