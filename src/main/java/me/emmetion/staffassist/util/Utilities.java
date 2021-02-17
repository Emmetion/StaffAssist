package me.emmetion.staffassist.util;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Utilities {


    public static String getColor(String string){
        return ChatColor.translateAlternateColorCodes('&',string);
    }


    public static List<String> getColor(List<String> string){

        List<String> builder = new ArrayList<>();

        for (String s : string){
            builder.add(ChatColor.translateAlternateColorCodes('&',s));
        }

        return builder;
    }

    public static ItemStack createItem(Material material, String displayName, List<String> lore){
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
