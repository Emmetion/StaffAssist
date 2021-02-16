package me.emmetion.staffassist.commands;

import me.emmetion.staffassist.menus.PlayerController;
import me.emmetion.staffassist.menus.PlayerMenuUtility;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.emmetion.staffassist.util.Utilities.getColor;

public class OpenController implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {


        if (sender instanceof Player){
            Player player = (Player) sender;
            if (sender.hasPermission("staffassist.controller")){
                try{
                    String argument1 = args[0];


                    Player target = Bukkit.getPlayer(argument1);

                    if (target == null){
                        player.sendMessage(getColor("&cPlayer not found"));
                        return true;
                    }

                    PlayerController controller = new PlayerController(new PlayerMenuUtility(player, target));

                    controller.setTarget(target);

                    controller.open();

                }catch(ArrayIndexOutOfBoundsException e){
                    player.sendMessage(getColor("Missing Player Argument. /sacontroller <player>"));
                }
            }else{
                player.sendMessage(getColor("Missing Permissions. (staffassist.controller)"));
            }
        }

        return true;
    }
}
