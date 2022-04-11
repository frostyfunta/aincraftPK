package io.github.frostyfunta.aincraftpk.listener;

import io.github.frostyfunta.aincraftpk.player.PlayerData;
import io.github.frostyfunta.aincraftpk.player.PlayerHash;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;
import java.util.UUID;

public class LoginListener implements Listener {
    PlayerHash map = new PlayerHash();
    HashMap<UUID, PlayerData> playerDataHashMap = map.getPlayerHash();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        UUID playerID = event.getPlayer().getUniqueId();
        //if player is not in the Hashmap yet - add this person with green status and no immunity
        if(!playerDataHashMap.containsKey(event.getPlayer().getUniqueId())){
            PlayerData data = new PlayerData();
            String[] dataArray = data.getDataArray();
            playerDataHashMap.put(playerID, data);
            System.out.println("Player with ID: " + playerID + "has been added with the following parameters: ");
            for(int i = 0; i < 3; i++){
                System.out.println(dataArray[i]);
            }
        } else {
            System.out.println("The player with the ID: " + playerID + " was already in the Hashmap");
        }
    }

}
