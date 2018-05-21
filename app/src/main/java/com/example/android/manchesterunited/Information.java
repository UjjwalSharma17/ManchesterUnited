package com.example.android.manchesterunited;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        PlayerInformation playerInformation = (PlayerInformation) getIntent().getSerializableExtra("info");

        TextView playerInformationName = (TextView) findViewById(R.id.player_information_name);
        playerInformationName.setText(playerInformation.getPlayerName());

        TextView playerInformationDescription = (TextView) findViewById(R.id.player_information_discription);
        playerInformationDescription.setText(playerInformation.getInfo());

    }
}
