package me.emmetion.staffassist.menus.playercontroller;

import me.emmetion.staffassist.menus.Menu;
import me.emmetion.staffassist.menus.PlayerMenuUtility;
import me.emmetion.staffassist.util.Utilities;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class ConfirmRestoreMenu extends Menu {

    int inv;

    public ConfirmRestoreMenu(PlayerMenuUtility playerMenuUtility, int inv) {
        super(playerMenuUtility);
        this.inv = inv;
    }

    public ConfirmRestoreMenu(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
    }

    @Override
    public String getMenuName() {
        return "&cConfirm Menu Restoration?";
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public void handleMenu(InventoryClickEvent event) {
        int rawSlot = event.getRawSlot();


        if (rawSlot < 27){
            event.setCancelled(true);
        }

        if (rawSlot == 11){

            // This will give the items back to the player.

        }


    }

    @Override
    public void close(InventoryCloseEvent event) {

    }

    @Override
    public void setMenuItems() {
        ItemStack v = FILLER_GLASS;

        ItemStack c = Utilities.createItem(Material.GREEN_STAINED_GLASS_PANE,
                "&bConfirm?",
                Arrays.asList("&7Are you sure that you want to restore this inventory to the player?",
                        "&7If their inventory is full, extra items will be dropped at their feet."));

        ItemStack[] contents = {
                v, v, v, v, v, v, v, v, v,
                v, v, c, v, v, v, v, v, v,
                v, v, v, v, v, v, v, v, v
        };


        inventory.setContents(contents);

    }
}
