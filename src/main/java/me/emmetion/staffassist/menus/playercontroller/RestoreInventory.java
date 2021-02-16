package me.emmetion.staffassist.menus.playercontroller;

import me.emmetion.staffassist.Main;
import me.emmetion.staffassist.menus.Menu;
import me.emmetion.staffassist.menus.PlayerMenuUtility;
import me.emmetion.staffassist.util.CommonItems;
import me.emmetion.staffassist.util.DeadInventory;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class RestoreInventory extends Menu {
    public RestoreInventory(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
    }

    @Override
    public String getMenuName() {
        return "&cRestore Inventory";
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public void handleMenu(InventoryClickEvent event) {

    }

    @Override
    public void close(InventoryCloseEvent event) {

    }

    @Override
    public void setMenuItems() {


        ArrayList<ItemStack> invItems = new ArrayList<>();




        DeadInventory di = Main.deadInventory.get(playerMenuUtility.getPlayer().getUniqueId().toString()).get(0);
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

        String date = dateFormat.format(di.getTimeStamp());



        ItemStack v = CommonItems.voidItem;

        ItemStack[] contents = {
                v,v,v,v,v,v,v,v,v,
                v,CommonItems.cItem(Material.ACACIA_SAPLING,""+date,null),v,v,v,v,v,v,v,
                v,v,v,v,v,v,v,v,v
        };

        inventory.setContents(contents);

    }
}
