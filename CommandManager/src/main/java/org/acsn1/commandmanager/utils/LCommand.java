package org.acsn1.commandmanager.utils;

import org.bukkit.command.CommandSender;

public interface LCommand {

    String getName();
    String getPermission();
    void perform(CommandSender sender, String[] args);

}
