package me.emmetion.staffassist.util;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;

import java.util.Date;

public class DeadInventory {

    Player deadPlayer;
    PlayerInventory deadInventory;
    Date timeStamp;

    public DeadInventory(Player deadPlayer, PlayerInventory deadInventory, Date timeStamp) {
        this.deadPlayer = deadPlayer;
        this.deadInventory = deadInventory;
        this.timeStamp = timeStamp;
    }


    public Inventory getDeadInventory() {
        return deadInventory;
    }

    public void setDeadInventory(PlayerInventory deadInventory) {
        this.deadInventory = deadInventory;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Player getDeadPlayer() {
        return deadPlayer;
    }

    public void setDeadPlayer(Player deadPlayer) {
        this.deadPlayer = deadPlayer;
    }
}
