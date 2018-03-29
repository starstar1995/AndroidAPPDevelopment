package com.example.apple.footprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process_layout);

    }

    public void imgButtonClick_process(View view){
        Intent intent = new Intent(MainActivity.this, ProcessActivity.class);
        startActivity(intent);
    }

    public void imgButtonClick_activity(View view){
        Intent intent = new Intent(MainActivity.this, ActivityActivity.class);
        startActivity(intent);
    }

    public void imgButtonClick_plan(View view){
        Intent intent = new Intent(MainActivity.this, PlanActivity.class);
        startActivity(intent);
    }

    public void imgButtonClick_profile(View view){
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}


