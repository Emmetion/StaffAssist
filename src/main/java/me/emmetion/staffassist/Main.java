package me.emmetion.staffassist;

import me.emmetion.staffassist.commands.OpenController;
import me.emmetion.staffassist.listeners.MenuListener;
import me.emmetion.staffassist.menus.Menu;
import me.emmetion.staffassist.menus.PlayerController;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable(){
        Server server = getServer();
        PluginManager pm = server.getPluginManager();

        pm.registerEvents(new MenuListener(),this);

        getCommand("opencontroller").setExecutor(new OpenController());

    }

}
