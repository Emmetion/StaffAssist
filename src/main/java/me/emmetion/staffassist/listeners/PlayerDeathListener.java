package me.emmetion.staffassist.listeners;

import me.emmetion.staffassist.managers.DeadInventoryManager;
import me.emmetion.staffassist.util.DeadInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.PlayerInventory;

import java.util.Date;

public class PlayerDeathListener implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();

        PlayerInventory inv = player.getInventory();

        long ts = System.currentTimeMillis();
        Date currentDate = new Date(ts);


        /**
         * Add a new inventory to the players backlog of inventories
         */

        if (DeadInventoryManager.hasPlayer(player)){
            DeadInventoryManager.addDeadInventory(player,new DeadInventory(player,inv,currentDate,player.getLastDamageCause().getCause()));
        }






    }
}
