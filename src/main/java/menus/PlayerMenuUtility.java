package menus;

import org.bukkit.entity.Player;

public class PlayerMenuUtility {


    private Player player;
    private Player owner;
    private String menu;

    public PlayerMenuUtility(Player player, Player owner, String menu){
        this.player = player;
        this.owner = owner;
        this.menu = menu;
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

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
