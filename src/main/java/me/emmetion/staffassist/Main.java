package me.emmetion.staffassist;

import me.emmetion.staffassist.commands.OpenController;
import me.emmetion.staffassist.listeners.PlayerDeathListener;
import me.emmetion.staffassist.listeners.PlayerJoinListener;
import me.emmetion.staffassist.listeners.MenuListener;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Date;

public class Main extends JavaPlugin {

    public static Date date;
    public static Server server;

    @Override
    public void onEnable(){

        date = new Date(); // Initialize the Date class, used in DeadInventoryManager
        server = getServer();


        // Register All Required Events

        registerEvents();
        registerCommands();


    }

    public void registerEvents(){
        PluginManager pm = server.getPluginManager();

        pm.registerEvents(new MenuListener(),this);
        pm.registerEvents(new PlayerJoinListener(),this);
        pm.registerEvents(new PlayerDeathListener(),this);
    }

    public void registerCommands(){
        getCommand("opencontroller").setExecutor(new OpenController());

    }


}
