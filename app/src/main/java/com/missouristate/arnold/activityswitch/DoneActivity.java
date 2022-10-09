package com.missouristate.arnold.activityswitch;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import android.view.View;

public class DoneActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
    }

    public void Done(View v) {
        this.finish();
    }
}
