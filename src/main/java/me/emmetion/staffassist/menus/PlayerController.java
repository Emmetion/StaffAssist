package me.emmetion.staffassist.menus;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerController extends Menu{


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

    }

    @Override
    public void close(InventoryCloseEvent event) {

    }

    @Override
    public void setMenuItems() {

        ItemStack v = FILLER_GLASS;

        ItemStack[] items = {
                v,v,v,v,v,v,v,v,v,
                v,null,null,null,null,null,null,null,v,
                v,v,v,v,v,v,v,v,v
        };

        inventory.setContents(items);
    }

    public void setTarget(Player player){
        this.target = player;
    }

}
