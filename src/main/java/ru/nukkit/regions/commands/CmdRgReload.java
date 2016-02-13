package ru.nukkit.regions.commands;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import ru.nukkit.regions.Regions;
import ru.nukkit.regions.RegionsPlugin;
import ru.nukkit.regions.util.Message;

@CmdDefine(command = "region", alias = "rg", subCommands = "reload", permission = "regions.reload", description = Message.RG_RELOAD_DESC)
public class CmdRgReload extends Cmd {
    @Override
    public boolean execute(CommandSender sender, Player player, String[] args) {
        RegionsPlugin.getCfg().load();
        Regions.getManager().load();
        return Message.RG_RELOAD_OK.print(sender,Regions.getManager().getRegions().size());
    }
}
