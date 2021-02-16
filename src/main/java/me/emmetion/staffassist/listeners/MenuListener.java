package me.emmetion.staffassist.listeners;

import me.emmetion.staffassist.menus.Menu;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.InventoryHolder;

public class MenuListener implements Listener {

    @EventHandler
    public void onMenuListener(InventoryClickEvent e){
        if (e.getInventory().getHolder() instanceof Menu){
            Menu menu = (Menu) e.getInventory().getHolder();

            menu.handleMenu(e);
        }
    }

    @EventHandler
    public void onCloseEvent(InventoryCloseEvent event){
        InventoryHolder holder = event.getInventory().getHolder();

        if (holder instanceof Menu){
            Menu menu = (Menu) holder;

            menu.close(event);
        }
    }
}
