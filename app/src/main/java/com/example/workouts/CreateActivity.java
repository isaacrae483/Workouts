package com.example.workouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import Model.Model;
import Model.Difficulties;
import Model.WorkoutTypes;

public class CreateActivity extends AppCompatActivity {

    TextView mTypeTitle;
    Spinner mTime;
    Spinner mDifficulty;
    Button mGenerate;
    Model data = Model.instance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        mTypeTitle = (TextView)findViewById(R.id.type_title);
        mTypeTitle.setText(data.getType().toString());

        mTime = (Spinner)findViewById(R.id.times_spinner);
        if (data.getTime() != 0) {
            mTime.setSelection(((ArrayAdapter<String>)mTime.getAdapter()).getPosition(Integer.toString(data.getTime()) + " min"));
        }
        mTime.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                data.setTime(i*15);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

        mDifficulty = (Spinner)findViewById(R.id.difficulties_spinner);
        if (data.getDifficulty() != null) {
            mDifficulty.setSelection(((ArrayAdapter<String>)mDifficulty.getAdapter()).getPosition((data.getDifficulty().toString())));
        }
        mDifficulty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        data.setDifficulty(null);
                        break;
                    case 1:
                        data.setDifficulty(Difficulties.EASY);
                        return;
                    case 2:
                        data.setDifficulty(Difficulties.MEDIUM);
                        return;
                    case 3:
                        data.setDifficulty(Difficulties.HARD);
                        return;
                    case 4:
                        data.setDifficulty(Difficulties.SPARTAN);
                        return;
                    default:
                        throw new IllegalArgumentException();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

        mGenerate = (Button)findViewById(R.id.generate_button);
        mGenerate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(data.getDifficulty() != null && data.getTime() != 0) {
                    data.generate();
                    Intent intent = new Intent(getBaseContext(), DisplayActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(getBaseContext(), "Please make a time and difficulty selection", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
