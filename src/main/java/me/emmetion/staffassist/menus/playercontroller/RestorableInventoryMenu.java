package me.emmetion.staffassist.menus.playercontroller;

import me.emmetion.staffassist.managers.DeadInventoryManager;
import me.emmetion.staffassist.menus.Menu;
import me.emmetion.staffassist.menus.PlayerMenuUtility;
import me.emmetion.staffassist.util.DeadInventory;
import me.emmetion.staffassist.util.Utilities;
import org.bukkit.Material;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class RestorableInventoryMenu extends Menu {
    public RestorableInventoryMenu(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
    }

    /**
     * The RestorableInventoryMenu is a menu with the purpose of listing off
     * every death that the player has had and give an option to restore that death inventory.
     */


    @Override
    public String getMenuName() {
        return "&cRestore Inventory";
    }

    @Override
    public int getSlots() {
        return 36;
    }

    @Override
    public void handleMenu(InventoryClickEvent event) {

    }

    @Override
    public void close(InventoryCloseEvent event) {

    }

    int[] page1 = {10,11,12,13,14,15,16,19,20,21,22,23,24,25};

    @Override
    public void setMenuItems() {

        ItemStack v = FILLER_GLASS;

        ItemStack[] contents = {
                v,v,v,v,v,v,v,v,v,
                v,v,v,v,v,v,v,v,v,
                v,v,v,v,v,v,v,v,v,
                v,v,v,v,v,v,v,v,v
        };

        for (int i = 0; i <  DeadInventoryManager.getInventories(playerMenuUtility.getPlayer()).size(); i++){

            SimpleDateFormat time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            SimpleDateFormat day = new SimpleDateFormat("YYYY-MM-dd");

            DeadInventory deadinv = DeadInventoryManager.getInventories(playerMenuUtility.getPlayer()).get(i);

            if (deadinv.getCause() == null){
                deadinv.setCause(EntityDamageEvent.DamageCause.VOID);
            }

            String date = time.format(deadinv.getTimeStamp());
            String dayDateFormatted = day.format(deadinv.getTimeStamp());
            contents[page1[i]] = Utilities.createItem(Material.ACACIA_SAPLING,
                    ""+date,
                    Arrays.asList("",
                    "&fDate: &c"+dayDateFormatted,
                    "&fReason: &c"+deadinv.getCause().toString()));
        }

        inventory.setContents(contents);

    }
}
