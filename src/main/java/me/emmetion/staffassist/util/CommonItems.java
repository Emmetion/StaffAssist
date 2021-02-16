package me.emmetion.staffassist.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

import static me.emmetion.staffassist.util.Utilities.getColor;

public class CommonItems {

    public static ItemStack voidItem = cItem(Material.GRAY_STAINED_GLASS_PANE," ",null);

    public static ItemStack cItem(Material material, String displayName, List<String> lore){
        ItemStack item = new ItemStack(material);
        ItemMeta itemmeta = item.getItemMeta();

        itemmeta.setDisplayName(getColor(displayName));
        if (lore != null){
            itemmeta.setLore(getColor(lore));
        }

        item.setItemMeta(itemmeta);

        return item;
    }

}
