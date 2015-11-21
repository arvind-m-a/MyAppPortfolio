package com.udacity.maar.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void buttonClick(View view){
        Button button = null;
        if(view instanceof Button) {
            button = (Button) view;

            switch (button.getText().toString()) {
                case "SPOTIFY STREAMER":
                    Toast.makeText(getApplicationContext(), "This button will launch the Spotify Streamer app", Toast.LENGTH_SHORT).show();
                    break;
                case "SCORES APP":
                    Toast.makeText(getApplicationContext(), "This button will launch the Scores app", Toast.LENGTH_SHORT).show();
                    break;
                case "LIBRARY APP":
                    Toast.makeText(getApplicationContext(), "This button will launch the Library app", Toast.LENGTH_SHORT).show();
                    break;
                case "BUILD IT BIGGER":
                    Toast.makeText(getApplicationContext(), "This button will launch the Build it Bigger app", Toast.LENGTH_SHORT).show();
                    break;
                case "XYZ READER":
                    Toast.makeText(getApplicationContext(), "This button will launch the XYZ Reader app", Toast.LENGTH_SHORT).show();
                    break;
                case "CAPSTONE: MY OWN APP":
                    Toast.makeText(getApplicationContext(), "This button will launch My own CapStone app", Toast.LENGTH_SHORT).show();
                    break;

            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
