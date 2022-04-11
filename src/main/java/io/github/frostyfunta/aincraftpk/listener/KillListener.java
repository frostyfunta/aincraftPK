package io.github.frostyfunta.aincraftpk.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillListener implements Listener {
    @EventHandler
    public void playerKilledPlayer(PlayerDeathEvent event){
        /*
        When a Player Kills another Player - adjust the KillerStatus accordingly
         */
    }
}
