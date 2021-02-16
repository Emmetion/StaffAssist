package me.emmetion.staffassist.util;

import org.bukkit.ChatColor;

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

}
