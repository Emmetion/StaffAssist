package me.emmetion.staffassist.menus;

import org.bukkit.entity.Player;

public class PlayerMenuUtility {


    private Player player;
    private Player owner;

    public PlayerMenuUtility(Player player, Player owner){
        this.player = player;
        this.owner = owner;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
