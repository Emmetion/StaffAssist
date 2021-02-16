package me.emmetion.staffassist;

import me.emmetion.staffassist.commands.OpenController;
import me.emmetion.staffassist.listeners.DeathListener;
import me.emmetion.staffassist.listeners.JoinListener;
import me.emmetion.staffassist.listeners.MenuListener;
import me.emmetion.staffassist.util.DeadInventory;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Main extends JavaPlugin {


    public static HashMap<String, List<DeadInventory>> deadInventory = new HashMap<>();

    public static Date date;

    @Override
    public void onEnable(){

        date = new Date();



        Server server = getServer();
        PluginManager pm = server.getPluginManager();

        pm.registerEvents(new MenuListener(),this);
        pm.registerEvents(new JoinListener(),this);
        pm.registerEvents(new DeathListener(),this);

        getCommand("opencontroller").setExecutor(new OpenController());

    }

}
