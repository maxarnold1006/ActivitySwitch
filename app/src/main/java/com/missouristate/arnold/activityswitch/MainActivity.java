package com.missouristate.arnold.activityswitch;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int numberOfClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchActivities(View v) {
        Intent myIntent = new Intent(this, DoneActivity.class);
        this.startActivity(myIntent);
    }
        public void onStart(){
            super.onStart();
            Button incrementBT = findViewById(R.id.addone);
            incrementBT.setText("" + numberOfClicks);
            numberOfClicks++;
        }
    }


