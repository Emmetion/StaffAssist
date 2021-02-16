package me.emmetion.staffassist.menus;

import me.emmetion.staffassist.util.CommonItems;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import static me.emmetion.staffassist.util.Utilities.getColor;

public abstract class Menu implements Listener, InventoryHolder {
    protected Inventory inventory;

    protected PlayerMenuUtility playerMenuUtility;

    protected ItemStack FILLER_GLASS = CommonItems.voidItem;

    public Menu(PlayerMenuUtility playerMenuUtility){
        this.playerMenuUtility = playerMenuUtility;
    }

    public abstract String getMenuName();

    public abstract int getSlots();

    @EventHandler
    public abstract void handleMenu(InventoryClickEvent event);

    @EventHandler
    public abstract void close(InventoryCloseEvent event);

    public abstract void setMenuItems();

    public void open(){
        inventory = Bukkit.createInventory(this,getSlots(),getColor(getMenuName()));

        this.setMenuItems();

        playerMenuUtility.getOwner().openInventory(inventory);
    }

    @Override

    public Inventory getInventory(){ return inventory; }









}
