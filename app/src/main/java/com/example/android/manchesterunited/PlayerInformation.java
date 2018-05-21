package com.example.android.manchesterunited;

import java.io.Serializable;

/**
 * Created by ujjwal on 06-01-2017.
 */

public class PlayerInformation implements Serializable {

    private String mPlayerName;
    private int mInfoResourceId;

    public PlayerInformation(String playerName, int infoResourceId){
        mPlayerName = playerName;
        mInfoResourceId = infoResourceId;
    }

    public String getPlayerName(){
        return mPlayerName;
    }

    public int getInfo(){
        return mInfoResourceId;
    }

}
