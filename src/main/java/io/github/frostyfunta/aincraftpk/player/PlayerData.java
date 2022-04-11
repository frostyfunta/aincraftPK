package io.github.frostyfunta.aincraftpk.player;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlayerData { //custom Class for Object to be inserted into Hashmap
    String TIME_LEFT;
    String PLAYER_STATUS;
    boolean IMMUNITY;

    public PlayerData(){
        //returns "clean" PlayerDate when called without arguments
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        TIME_LEFT = dtf.format(now);
        PLAYER_STATUS = "green";
        IMMUNITY = false;
    }

    public String [] getDataArray(){
        String[] data = {TIME_LEFT, PLAYER_STATUS, String.valueOf(IMMUNITY)};
        return data;
    }



}
