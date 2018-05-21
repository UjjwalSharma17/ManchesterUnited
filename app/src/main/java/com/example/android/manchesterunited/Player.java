package com.example.android.manchesterunited;

/**
 * Created by ujjwal on 05-01-2017.
 */

public class Player {

    private String mPlayerName;
    private String mNationality;
    private int mImageResourceId;

    public Player(String playerName, String nationality, int imageResourceId){
        mPlayerName = playerName;
        mNationality = nationality;
        mImageResourceId = imageResourceId;
    }

    public String getPlayerName(){
        return mPlayerName;
    }

    public String getNationality(){
        return mNationality;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}
