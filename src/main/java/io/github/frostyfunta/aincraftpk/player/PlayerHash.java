package io.github.frostyfunta.aincraftpk.player;


import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class PlayerHash implements Serializable {//Hashmap to store PlayerData inside
    private static HashMap<UUID, PlayerData> PlayerHash = new HashMap();

    public HashMap<UUID, PlayerData> getPlayerHash(){return PlayerHash;}

}
