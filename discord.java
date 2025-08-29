package de.leonfoundU.discord.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class discord implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage("hallo console, https://discord.gg/dPfaQVKyH8");
            return true;
        }


        if (sender.hasPermission("discord.use")) {
            sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Unser discord:https://discord.gg/dPfaQVKyH8");
            return true;
        }

        sender.sendMessage("§cDu hast keine Berechtigung, diesen Befehl zu benutzen!");
        return true;
    }
}
