package com.example.android.manchesterunited;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Goalkeeper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players_list_view);

        ArrayList<Player> playerArrayList = new ArrayList<>();

        playerArrayList.add(new Player("Peter Schmeichel", "Denmark", R.drawable.peter_schmeichel));
        playerArrayList.add(new Player("Edvin Van Der Sar", "Netherlands", R.drawable.van_der_sar));
        playerArrayList.add(new Player("David De Gea", "Spain", R.drawable.david_de_gea));
        playerArrayList.add(new Player("Alex Stepney", "UK", R.drawable.alex_stepney));
        playerArrayList.add(new Player("Jimmy Rimmer", "UK", R.drawable.jimmy_rimmer));
        playerArrayList.add(new Player("Harry Gregg", "Northern Ireland", R.drawable.harry_gregg));
        playerArrayList.add(new Player("Reg Allen", "UK", R.drawable.reg_allen));

        PlayerAdapter playerAdapter = new PlayerAdapter(Goalkeeper.this, playerArrayList, R.color.colorPrimary, R.color.colorPrimaryDark);

        ListView completeListView = (ListView) findViewById(R.id.complete_list_view);
        completeListView.setAdapter(playerAdapter);

        //Setting OnItemClickListener
        //final is used before declaring the array so that we can use it inside of onItemClick method.

        final PlayerInformation[] goalkeeper = new PlayerInformation[7];
        goalkeeper[0] = new PlayerInformation("Peter Schmeichel", R.string.peter_schmeichel);
        goalkeeper[1] = new PlayerInformation("Edvin Van Der Sar", R.string.van_der_sar);
        goalkeeper[2] = new PlayerInformation("David De Gea", R.string.david_de_gea);
        goalkeeper[3] = new PlayerInformation("Alex Stepney", R.string.alex_stepney);
        goalkeeper[4] = new PlayerInformation("Jimmy Rimmer", R.string.jimmy_rimmer);
        goalkeeper[5] = new PlayerInformation("Harry Gregg", R.string.harry_gregg);
        goalkeeper[6] = new PlayerInformation("Reg Allen", R.string.reg_allen);


        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Goalkeeper.this, Information.class);

               //we were able to send the object goalkeeper[position] only because class PlayerInformation implements Serializable.

                intent.putExtra("info", goalkeeper[position]);
                startActivity(intent);
            }
        };

        completeListView.setOnItemClickListener(onItemClickListener);

    }
}
