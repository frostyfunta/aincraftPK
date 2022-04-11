package io.github.frostyfunta.aincraftpk.player;


import java.util.HashMap;
import java.util.UUID;

public class PlayerHash {//Hashmap to store PlayerData inside
    private static HashMap<UUID, PlayerData> PlayerHash = new HashMap();

    public HashMap<UUID, PlayerData> getPlayerHash(){return PlayerHash;}
}
