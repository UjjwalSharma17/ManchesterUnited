package com.example.android.manchesterunited;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Attacker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players_list_view);

        ArrayList<Player> playerArrayList = new ArrayList<>();

        playerArrayList.add(new Player("Wayne Rooney", "England", R.drawable.wayne_rooney));
        playerArrayList.add(new Player("Eric Cantona", "France", R.drawable.eric_cantona));
        playerArrayList.add(new Player("Denis Law", "UK", R.drawable.denis_law));
        playerArrayList.add(new Player("Bobby Charlton", "UK", R.drawable.bobby_charlton));
        playerArrayList.add(new Player("Zlatan Ibrahimovic", "Sweden", R.drawable.zlatan_ibrahimovic));
        playerArrayList.add(new Player("Teddy Sheringham", "England", R.drawable.teddy_sheringham));
        playerArrayList.add(new Player("Dwight Yorke", "Trinidad And Tobago", R.drawable.dwight_yorke));
        playerArrayList.add(new Player("Dennis Viollet", "UK", R.drawable.denis_violet));
        playerArrayList.add(new Player("Ruud Van Nistelrooy", "Netherlands", R.drawable.ruud_van_nistelrooy));
        playerArrayList.add(new Player("Mark Hughes", "UK", R.drawable.mark_hughes));
        playerArrayList.add(new Player("Andy Cole", "UK", R.drawable.andy_cole));

        PlayerAdapter playerAdapter = new PlayerAdapter(Attacker.this, playerArrayList, R.color.colorPrimary, R.color.colorPrimaryDark);

        ListView completeListView = (ListView) findViewById(R.id.complete_list_view);
        completeListView.setAdapter(playerAdapter);

        final PlayerInformation[] attacker = new PlayerInformation[11];
        attacker[0] = new PlayerInformation("Wayne Rooney", R.string.wayne_rooney);
        attacker[1] = new PlayerInformation("Eric Cantona", R.string.eric_cantona);
        attacker[2] = new PlayerInformation("Denis Law", R.string.denis_law);
        attacker[3] = new PlayerInformation("Bobby Charlton", R.string.bobby_charlton);
        attacker[4] = new PlayerInformation("Zlatan Ibrahimovic", R.string.zlatan_ibrahimovic);
        attacker[5] = new PlayerInformation("Teddy Sheringham", R.string.teddy_sheringham);
        attacker[6] = new PlayerInformation("Dwight Yorke", R.string.dwight_yorke);
        attacker[7] = new PlayerInformation("Dennis Viollet", R.string.dennis_viollet);
        attacker[8] = new PlayerInformation("Ruud Van Nistelroy", R.string.ruud_van_nistelroy);
        attacker[9] = new PlayerInformation("Mark Hughes", R.string.mark_hughes);
        attacker[10] = new PlayerInformation("Andy Cole", R.string.andy_cole);


        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Attacker.this, Information.class);
                intent.putExtra("info", attacker[position]);
                startActivity(intent);
            }
        };

        completeListView.setOnItemClickListener(onItemClickListener);


    }
}
