package me.emmetion.staffassist.managers;

import me.emmetion.staffassist.util.DeadInventory;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DeadInventoryManager {

    private static HashMap<String, List<DeadInventory>> deadInventory = new HashMap<>();

    public static HashMap<String, List<DeadInventory>> getDeadInventory() {
        return deadInventory;
    }

    public static boolean hasPlayer(Player player) {
        return deadInventory.containsKey(player.getUniqueId().toString()) ? true : false;
    }


    public static void addPlayer(Player player) {
        deadInventory.put(player.getUniqueId().toString(), new ArrayList<>());
    }

    public static void addDeadInventory(Player player, DeadInventory deadInv) {
        String uuid = player.getUniqueId().toString();
        deadInventory.get(uuid).add(deadInv);
    }

    public static List<DeadInventory> getInventories(Player player) {
        if (hasPlayer(player)) {
            return deadInventory.get(player.getUniqueId());
        }
        return null;
    }

}
