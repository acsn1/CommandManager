package org.acsn1.commandmanager;

import org.acsn1.commandmanager.utils.Manager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandManager extends JavaPlugin {

    private static CommandManager instance;
    private Manager manager;

    @Override
    public void onEnable() {
        instance = this;
        manager = new Manager();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static CommandManager getInstance() { return instance; }
    public Manager getManager() { return manager; }
}
