package me.emmetion.staffassist.listeners;

import me.emmetion.staffassist.Main;
import me.emmetion.staffassist.managers.DeadInventoryManager;
import me.emmetion.staffassist.util.DeadInventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;
import java.util.List;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent e){

        /**
         * Add the player to the DeadInventory HashMap to start and store data on their deaths.
         */

        if (DeadInventoryManager.hasPlayer(e.getPlayer())){
            return;
        }else{
            DeadInventoryManager.addPlayer(e.getPlayer());
        }
    }
}
