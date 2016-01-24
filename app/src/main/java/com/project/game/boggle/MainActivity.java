package com.app.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnTouchListener;

import android.view.MotionEvent;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity  {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final TextView textview1 = (TextView) findViewById(R.id.tv1);
        final TextView textview2 = (TextView) findViewById(R.id.tv2);
        final TextView textview3 = (TextView) findViewById(R.id.tv3);
        final TextView textview4 = (TextView) findViewById(R.id.tv4);
        final TextView textview5 = (TextView) findViewById(R.id.tv5);
        final TextView textview6 = (TextView) findViewById(R.id.tv6);
        final TextView textview7 = (TextView) findViewById(R.id.tv7);
        final TextView textview8 = (TextView) findViewById(R.id.tv8);
        final TextView textview9 = (TextView) findViewById(R.id.tv9);
        final TextView textview10 = (TextView) findViewById(R.id.tv10);
        final TextView textview11 = (TextView) findViewById(R.id.tv11);
        final TextView textview12 = (TextView) findViewById(R.id.tv12);
        final TextView textview13 = (TextView) findViewById(R.id.tv13);
        final TextView textview14 = (TextView) findViewById(R.id.tv14);
        final TextView textview15 = (TextView) findViewById(R.id.tv15);
        final TextView textview16 = (TextView) findViewById(R.id.tv16);

        List<Character> dieList =  GridGenerator.getRandomDice();

        final Character ch1 = dieList.get(0);
        final Character ch2 = dieList.get(1);
        final Character ch3 = dieList.get(2);
        final Character ch4 = dieList.get(3);
        final Character ch5 = dieList.get(4);
        final Character ch6 = dieList.get(5);
        final Character ch7 = dieList.get(6);
        final Character ch8 = dieList.get(7);
        final Character ch9 = dieList.get(8);
        final Character ch10 = dieList.get(9);
        final Character ch11 = dieList.get(10);
        final Character ch12 = dieList.get(11);
        final Character ch13 = dieList.get(12);
        final Character ch14 = dieList.get(13);
        final Character ch15 = dieList.get(14);
        final Character ch16 = dieList.get(15);


        GridGenerator.alphaImg(textview1, ch1);
        GridGenerator.alphaImg(textview2, ch2);
        GridGenerator.alphaImg(textview3, ch3);
        GridGenerator.alphaImg(textview4, ch4);
        GridGenerator.alphaImg(textview5, ch5);
        GridGenerator.alphaImg(textview6, ch6);
        GridGenerator.alphaImg(textview7, ch7);
        GridGenerator.alphaImg(textview8, ch8);
        GridGenerator.alphaImg(textview9, ch9);
        GridGenerator.alphaImg(textview10, ch10);
        GridGenerator.alphaImg(textview11, ch11);
        GridGenerator.alphaImg(textview12, ch12);
        GridGenerator.alphaImg(textview13, ch13);
        GridGenerator.alphaImg(textview14, ch14);
        GridGenerator.alphaImg(textview15, ch15);
        GridGenerator.alphaImg(textview16, ch16);




        textview1.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview1, ch1);
                                             return true;
                                         }
                                     }
        );


        textview2.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {
                                             WordSelection.highlight(textview2, ch2);
                                             return true;
                                         }
                                     }
        );

        textview3.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview3, ch3);
                                             return true;
                                         }
                                     }
        );


        textview4.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview4, ch4);
                                             return true;
                                         }
                                     }
        );



        textview5.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview5, ch5);
                                             return true;
                                         }
                                     }
        );


        textview6.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview6, ch6);
                                             return true;
                                         }
                                     }
        );


        textview7.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview7, ch7);
                                             return true;
                                         }
                                     }
        );


        textview8.setOnTouchListener(new View.OnTouchListener()
                                     {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview8, ch8);
                                             return true;
                                         }
                                     }
        );


        textview9.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview9, ch9);
                                             return true;
                                         }
                                     }
        );


        textview10.setOnTouchListener(new View.OnTouchListener()
                                      {
                                          public boolean onTouch(View v, MotionEvent event) {

                                              WordSelection.highlight(textview10, ch10);
                                              return true;
                                          }
                                      }
        );


        textview11.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview11, ch11);
                                             return true;
                                         }
                                     }
        );


        textview12.setOnTouchListener(new View.OnTouchListener()
                                     {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview12, ch12);
                                             return true;
                                         }
                                     }
        );


        textview13.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview13, ch13);
                                             return true;
                                         }
                                     }
        );


        textview14.setOnTouchListener(new View.OnTouchListener()
                                     {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview14, ch14);
                                             return true;
                                         }
                                     }
        );


        textview15.setOnTouchListener(new View.OnTouchListener() {
                                         public boolean onTouch(View v, MotionEvent event) {

                                             WordSelection.highlight(textview15, ch15);
                                             return true;
                                         }
                                     }
        );


        textview16.setOnTouchListener(new View.OnTouchListener()
                                      {
                                          public boolean onTouch(View v, MotionEvent event) {

                                              WordSelection.highlight(textview16, ch16);
                                              return true;
                                          }
                                      }
        );




        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.app.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.app.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
