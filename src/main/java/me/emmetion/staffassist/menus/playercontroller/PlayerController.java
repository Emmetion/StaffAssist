package me.emmetion.staffassist.menus.playercontroller;

import me.emmetion.staffassist.menus.Menu;
import me.emmetion.staffassist.menus.PlayerMenuUtility;
import me.emmetion.staffassist.util.CommonItems;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class PlayerController extends Menu {


    Player target;



    public PlayerController(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
    }

    @Override
    public String getMenuName() {
        return "&cPlayer Controller (" + target.getName() + "&c)";
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public void handleMenu(InventoryClickEvent event) {
        int click = event.getSlot();

        if (click < 28){
            event.setCancelled(true);
        }


        if (click == 10){
            target.setHealth(0);
        }

        if (click == 11){
            new RestoreInventory(playerMenuUtility).open();
        }


    }

    @Override
    public void close(InventoryCloseEvent event) {

    }

    @Override
    public void setMenuItems() {
        ItemStack kill = CommonItems.cItem(Material.REDSTONE_BLOCK,"&cKill " + target.getName()+"&c?", null);

        ItemStack previousInventories = CommonItems.cItem(Material.BEDROCK,"&fPrevious Inventories",null);

        ItemStack v = FILLER_GLASS;

        ItemStack[] items = {
                v,v,v,v,v,v,v,v,v,
                v,kill,previousInventories,null,null,null,null,null,v,
                v,v,v,v,v,v,v,v,v
        };

        inventory.setContents(items);
    }

    public void setTarget(Player player){
        this.target = player;
    }

}
