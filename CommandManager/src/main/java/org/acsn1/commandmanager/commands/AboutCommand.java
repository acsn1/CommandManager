package org.acsn1.commandmanager.commands;

import org.acsn1.commandmanager.utils.LCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AboutCommand implements LCommand {

    @Override
    public String getName() {
        return "about";
    }

    @Override
    public String getPermission() {
        /*
         * No permission required :== null
         */
        return null;
    }

    @Override
    public void perform(CommandSender sender, String[] args) {
        for(String response:getResponse()) {
            sender.sendMessage(response);
        }

        if(sender instanceof Player) sender.sendMessage("It seems that you are a player.");
    }

    private final String[] getResponse() {
        return new String[] {"The author of this plugin is acsn1#6510",
                "This is a very basic command manager.",
                "The plugin itself is a very basic-plain structure of handling commands through one executor."};
    }
}
