package com.example.android.manchesterunited;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Defender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players_list_view);

        ArrayList<Player> playerArrayList = new ArrayList<>();

        playerArrayList.add(new Player("Gary Neville", "England", R.drawable.gary_neville));
        playerArrayList.add(new Player("Rio Ferdinand", "England", R.drawable.rio_ferdinand));
        playerArrayList.add(new Player("Nemanja Vidic", "Serbia", R.drawable.nemanja_vidic));
        playerArrayList.add(new Player("Denis Irwin", "Republic Of Ireland", R.drawable.denis_irwin));
        playerArrayList.add(new Player("Jaap Stam", "Netherlands", R.drawable.jaap_stam));
        playerArrayList.add(new Player("Patrice Evra", "Senegal", R.drawable.patrice_evra));
        playerArrayList.add(new Player("Steve Bruce", "UK", R.drawable.steve_bruce));
        playerArrayList.add(new Player("Bill Foulkes", "UK", R.drawable.bill_foulkes));
        playerArrayList.add(new Player("Paul McGrath", "UK", R.drawable.paul_mcgrath));
        playerArrayList.add(new Player("Phil Neville", "England", R.drawable.phil_neville));

        PlayerAdapter playerAdapter = new PlayerAdapter(Defender.this, playerArrayList, R.color.colorPrimary, R.color.colorPrimaryDark);

        ListView completeListView = (ListView) findViewById(R.id.complete_list_view);
        completeListView.setAdapter(playerAdapter);

        final PlayerInformation[] defender = new PlayerInformation[10];
        defender[0] = new PlayerInformation("Gary Neville", R.string.gary_neville);
        defender[1] = new PlayerInformation("Rio Ferdinand", R.string.rio_ferdinand);
        defender[2] = new PlayerInformation("Nemanja Vidic", R.string.nemanja_vidic);
        defender[3] = new PlayerInformation("Denis Irwin", R.string.denis_irwin);
        defender[4] = new PlayerInformation("Jaap Stam", R.string.jaap_stam);
        defender[5] = new PlayerInformation("Patrice Evra", R.string.patrice_evra);
        defender[6] = new PlayerInformation("Steve Bruce", R.string.steve_bruce);
        defender[7] = new PlayerInformation("Bill Foulkes", R.string.bill_foulkes);
        defender[8] = new PlayerInformation("Paul McGrath", R.string.paul_mcgrath);
        defender[9] = new PlayerInformation("Phil Neville", R.string.phil_neville);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Defender.this, Information.class);

                //we were able to send the object defender[position] only because class PlayerInformation implements Serializable.

                intent.putExtra("info", defender[position]);
                startActivity(intent);
            }
        };

        completeListView.setOnItemClickListener(onItemClickListener);

    }
}
