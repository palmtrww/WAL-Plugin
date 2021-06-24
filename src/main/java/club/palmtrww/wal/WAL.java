package club.palmtrww.wal;

import club.palmtrww.wal.events.PlayerJoin;
import club.palmtrww.wal.events.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

public class WAL extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

}
