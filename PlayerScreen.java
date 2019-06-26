package com.example.matching;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayerScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_screen);

        //setting up variable names for front screen
        final EditText P1 = (EditText) findViewById(R.id.P1Name);
        final EditText P2 = (EditText) findViewById(R.id.P2Name);
        final Button play = (Button) findViewById(R.id.PlayButton);

        //clicking play button sends to game with names set
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Player_1 = "" + P1.getText().toString();
                String Player_2 = "" + P2.getText().toString();

                //call that sets up separate screens
                //Grabs names from the first screen to transfer over to the game
                Intent startGame = new Intent(PlayerScreen.this, MainActivity.class);
                startGame.putExtra("Player_1", Player_1);
                startGame.putExtra("Player_2", Player_2);
                startActivity(startGame);
            }
        });



    }
}