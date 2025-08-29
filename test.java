package de.leonfoundU.discord;

import de.leonfoundU.discord.commands.discord;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("discord").setExecutor(new discord());
        getLogger().info("plugins started");
    }

    @Override
    public void onDisable() {
        getLogger().info("plugins shutdown");
    }
}
