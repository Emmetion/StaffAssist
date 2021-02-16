package me.emmetion.staffassist.listeners;

import me.emmetion.staffassist.Main;
import me.emmetion.staffassist.util.DeadInventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;
import java.util.List;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent e){
        if (Main.deadInventory.containsKey(e.getPlayer().getUniqueId().toString())){
            return;
        }else{
            Main.deadInventory.put(e.getPlayer().getUniqueId().toString(),new ArrayList<DeadInventory>());
        }
    }
}
