package me.emmetion.staffassist.menus.playercontroller;

import me.emmetion.staffassist.menus.Menu;
import me.emmetion.staffassist.menus.PlayerMenuUtility;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class PreviousInventoryMenu extends Menu {

    public PreviousInventoryMenu(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
    }

    @Override
    public String getMenuName() {
        return "&cInventory Preview";
    }

    @Override
    public int getSlots() {
        return 54;
    }

    @Override
    public void handleMenu(InventoryClickEvent event) {

    }

    @Override
    public void close(InventoryCloseEvent event) {

    }

    @Override
    public void setMenuItems() {



    }
}
