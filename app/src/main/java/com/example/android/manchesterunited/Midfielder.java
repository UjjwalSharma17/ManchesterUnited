package com.example.android.manchesterunited;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Midfielder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players_list_view);

        ArrayList<Player> playerArrayList = new ArrayList<>();

        playerArrayList.add(new Player("Paul Scholes", "England", R.drawable.paul_scholes));
        playerArrayList.add(new Player("George Best", "UK", R.drawable.george_best));
        playerArrayList.add(new Player("Ryan Giggs", "Whales", R.drawable.ryan_giggs));
        playerArrayList.add(new Player("Roy Keane", "Republic Of Ireland", R.drawable.roy_keane));
        playerArrayList.add(new Player("David Beckham", "England", R.drawable.david_beckham));
        playerArrayList.add(new Player("Cristiano Ronaldo", "Portugal", R.drawable.cristiano_ronaldo));
        playerArrayList.add(new Player("Paul Pogba", "France", R.drawable.paul_pogba));
        playerArrayList.add(new Player("Nobby Stiles", "UK", R.drawable.nobby_stiles));
        playerArrayList.add(new Player("Paddy Crerand", "Scotland", R.drawable.paddy_crerand));
        playerArrayList.add(new Player("Ole Gunnar Solskjaer", "Norway", R.drawable.ole_gunnar));
        playerArrayList.add(new Player("Bryan Robson", "UK", R.drawable.bryan_robson));
        playerArrayList.add(new Player("Nani", "Portugal", R.drawable.nani));

        PlayerAdapter playerAdapter = new PlayerAdapter(Midfielder.this, playerArrayList, R.color.colorPrimary, R.color.colorPrimaryDark);

        ListView completeListView = (ListView) findViewById(R.id.complete_list_view);
        completeListView.setAdapter(playerAdapter);

        final PlayerInformation[] midfielder = new PlayerInformation[12];
        midfielder[0] = new PlayerInformation("Paul Scholes", R.string.paul_scholes);
        midfielder[1] = new PlayerInformation("George Best", R.string.george_best);
        midfielder[2] = new PlayerInformation("Ryan Giggs", R.string.ryan_giggs);
        midfielder[3] = new PlayerInformation("Roy Keane", R.string.roy_keane);
        midfielder[4] = new PlayerInformation("David Beckham", R.string.david_beckham);
        midfielder[5] = new PlayerInformation("Cristiano Ronaldo", R.string.cristiano_ronaldo);
        midfielder[6] = new PlayerInformation("Paul Pogba", R.string.paul_pogba);
        midfielder[7] = new PlayerInformation("Nobby Stiles", R.string.nobby_stiles);
        midfielder[8] = new PlayerInformation("Paddy Crerand", R.string.paddy_crerand);
        midfielder[9] = new PlayerInformation("Ole Gunnar Solksjaer", R.string.ole_gunnar_solskjaer);
        midfielder[10] = new PlayerInformation("Bryan Robson", R.string.bryan_robson);
        midfielder[11] = new PlayerInformation("Nani", R.string.nani);


        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Midfielder.this, Information.class);
                intent.putExtra("info", midfielder[position]);
                startActivity(intent);
            }
        };

        completeListView.setOnItemClickListener(onItemClickListener);

    }
}
