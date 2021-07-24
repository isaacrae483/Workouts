package com.example.workouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import Model.Model;
import Model.WorkoutTypes;

public class MainActivity extends AppCompatActivity {

    Button mRunning;
    Button mSwimming;
    Button mBicycling;
    Button mCoreOnly;
    Model data = Model.instance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRunning = (Button)findViewById(R.id.running_button);
        mRunning.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                data.setType(WorkoutTypes.RUNNING);
                Intent intent = new Intent(getBaseContext(), CreateActivity.class);
                startActivity(intent);
            }
        });

        mSwimming = (Button)findViewById(R.id.swimming_button);
        mSwimming.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                data.setType(WorkoutTypes.SWIMMING);
                Intent intent = new Intent(getBaseContext(), CreateActivity.class);
                startActivity(intent);
            }
        });

        mBicycling = (Button)findViewById(R.id.bicycling_button);
        mBicycling.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                data.setType(WorkoutTypes.CYCLING);
                Intent intent = new Intent(getBaseContext(), CreateActivity.class);
                startActivity(intent);
            }
        });

        mCoreOnly= (Button)findViewById(R.id.core_only_button);
        mCoreOnly.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                data.setType(WorkoutTypes.COREONLY);
                Intent intent = new Intent(getBaseContext(), CreateActivity.class);
                startActivity(intent);
            }
        });

    }



}
