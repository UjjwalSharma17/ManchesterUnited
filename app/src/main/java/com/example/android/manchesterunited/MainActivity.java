package com.example.android.manchesterunited;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstTextView = (TextView) findViewById(R.id.goalkeeperTextView);
        firstTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Goalkeeper.class);
                startActivity(intent);
            }
        });

        TextView secondTextView = (TextView) findViewById(R.id.defenderTextView);
        secondTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Defender.class);
                startActivity(intent);
            }
        });

        TextView thirdTextView = (TextView) findViewById(R.id.midfielderTextView);
        thirdTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Midfielder.class);
                startActivity(intent);
            }
        });

        TextView fourthTextView = (TextView) findViewById(R.id.attackerTextView);
        fourthTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Attacker.class);
                startActivity(intent);
            }
        });

    }

}
