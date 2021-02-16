package menus;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract class Menu {

    PlayerMenuUtility playerMenuUtility;

    public Menu(PlayerMenuUtility playerMenuUtility){
        this.playerMenuUtility = playerMenuUtility;
    }

    public abstract ItemStack[] setMenuItems();
    public abstract int menuSize();
    public abstract String menuTitle();

    @EventHandler
    public abstract void handleMenu(InventoryClickEvent event);


    public void createMenu(){


        Inventory inv = Bukkit.createInventory(playerMenuUtility.getOwner(),menuSize(),menuTitle());

        inv.setContents(setMenuItems());

    }









}
