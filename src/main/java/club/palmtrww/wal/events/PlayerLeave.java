package club.palmtrww.wal.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {



    @EventHandler
    public void onPlayerJoin(PlayerQuitEvent e) {
        Player player= e.getPlayer();
        e.setQuitMessage(ChatColor.DARK_BLUE +"Awww, why did you leave" + ChatColor.RED + player.getDisplayName() + "????");
    }


}
