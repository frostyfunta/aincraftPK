package io.github.frostyfunta.aincraftpk.manager;

import io.github.frostyfunta.aincraftpk.player.PlayerHash;
import org.bukkit.entity.Player;

import java.io.*;

public class HashHandler {
    PlayerHash data = new PlayerHash();

    public static void saveHash(PlayerHash data){
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/PlayerHash.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(data);
            out.close();
            fileOut.close();
            System.out.println("Serialized data stored in /tmp/PlayerHash.ser");

        } catch(IOException i){
            i.printStackTrace();
        }
    }

    public static PlayerHash loadHash(String dir){

    }
}
