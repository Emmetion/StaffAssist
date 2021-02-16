import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable(){
        Server server = getServer();
        PluginManager pm = server.getPluginManager();

    }

}
