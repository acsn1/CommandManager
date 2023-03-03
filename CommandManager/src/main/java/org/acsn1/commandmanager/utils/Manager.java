package org.acsn1.commandmanager.utils;

import org.acsn1.commandmanager.CommandManager;
import org.acsn1.commandmanager.commands.AboutCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashSet;
import java.util.Set;

public class Manager implements CommandExecutor {

    private Set<LCommand> COMMANDS = new HashSet<>();
    public Manager() {
        COMMANDS.add(new AboutCommand());

        for(LCommand command : COMMANDS){
            CommandManager.getInstance().getCommand(command.getName()).setExecutor(this);
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        for(LCommand cmd : COMMANDS) {
            if(command.getName().equalsIgnoreCase(cmd.getName())) {
                cmd.perform(sender, args);
            }
        }

        return false;
    }
}
