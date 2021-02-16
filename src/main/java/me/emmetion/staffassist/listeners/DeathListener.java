package me.emmetion.staffassist.listeners;

import me.emmetion.staffassist.Main;
import me.emmetion.staffassist.util.DeadInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DeathListener implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        Player player = event.getEntity();

        PlayerInventory inv = player.getInventory();

        long ts = System.currentTimeMillis();
        Date currentDate = new Date (ts);


        Main.deadInventory.get(player.getUniqueId().toString()).add(
                new DeadInventory(player,inv,currentDate));

        // add a new inventory

    }
}
