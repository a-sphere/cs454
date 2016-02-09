package com.project.game.boggle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Highscores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscores);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Container container = Container.getInstance();
        int length = container.getHighscores().size();

        for (int i = 1; i < length + 1; i++) {
            int j = i + 10;
            String playerTextViewID = "highscoreTextView"+ i;
            String scoreTextViewID = "highscoreTextView" + j;
            int playerID = getResources().getIdentifier(playerTextViewID, "id", getPackageName());
            int scoreID = getResources().getIdentifier(scoreTextViewID, "id", getPackageName());

            if (playerID != 0) {
                TextView playerTextView = (TextView) findViewById(playerID);
                TextView scoreTextView = (TextView) findViewById(scoreID);


                Iterator listIndex = container.getHighscores().get(i).keySet().iterator();
                String listKey = (String)listIndex.next();
                playerTextView.setText(listKey);
                scoreTextView.setText(container.getHighscores().get(i).get(listKey));

            }
        }
    }

}
