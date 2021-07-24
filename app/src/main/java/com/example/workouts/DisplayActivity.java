package com.example.workouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import Model.*;

public class DisplayActivity extends AppCompatActivity {

    TextView mTypeTitle;
    TextView mInfoTitle;
    TextView mLabel1;
    TextView mAmount1;
    TextView mLabel2;
    TextView mAmount2;
    TextView mLabel3;
    TextView mAmount3;
    TextView mLabel4;
    TextView mAmount4;
    TextView mLabel5;
    TextView mAmount5;
    TextView mLabel6;
    TextView mAmount6;

    Button mEasier;
    Button mChange;
    Button mHarder;
    Button mRestart;

    Model data = Model.instance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        mTypeTitle = (TextView)findViewById(R.id.type_title);
        mTypeTitle.setText(data.getType().toString());

        mInfoTitle = (TextView)findViewById(R.id.info_title);
        mInfoTitle.setText(Integer.toString(data.getTime()) + "min  " + data.getDifficulty().toString() );

        mLabel1 = (TextView)findViewById(R.id.label_1);
        mAmount1 = (TextView)findViewById(R.id.amount_1);

        mLabel2 = (TextView)findViewById(R.id.label_2);
        mAmount2 = (TextView)findViewById(R.id.amount_2);

        mLabel3 = (TextView)findViewById(R.id.label_3);
        mAmount3 = (TextView)findViewById(R.id.amount_3);

        mLabel4 = (TextView)findViewById(R.id.label_4);
        mAmount4 = (TextView)findViewById(R.id.amount_4);

        mLabel5 = (TextView)findViewById(R.id.label_5);
        mAmount5 = (TextView)findViewById(R.id.amount_5);

        mLabel6 = (TextView)findViewById(R.id.label_6);
        mAmount6 = (TextView)findViewById(R.id.amount_6);

        fillData();

        mEasier = (Button)findViewById(R.id.easier_button);
        mEasier.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                boolean changed = false;
                switch (data.getDifficulty()){
                    case EASY:
                        Toast.makeText(getBaseContext(), "Cannot make easier", Toast.LENGTH_SHORT).show();
                        break;
                    case MEDIUM:
                        data.setDifficulty(Difficulties.EASY);
                        changed = true;
                        break;
                    case HARD:
                        data.setDifficulty(Difficulties.MEDIUM);
                        changed = true;
                        break;
                    case SPARTAN:
                        data.setDifficulty(Difficulties.HARD);
                        changed = true;
                        break;
                    default:
                        Toast.makeText(getBaseContext(), "An error occurred please try again", Toast.LENGTH_SHORT).show();
                }
                if (changed) {
                    data.generate();
                    fillData();
                }
            }
        });

        mHarder = (Button)findViewById(R.id.harder_button);
        mHarder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                boolean changed = false;
                switch (data.getDifficulty()) {
                    case EASY:
                        data.setDifficulty(Difficulties.MEDIUM);
                        changed = true;
                        break;
                    case MEDIUM:
                        data.setDifficulty(Difficulties.HARD);
                        changed = true;
                        break;
                    case HARD:
                        data.setDifficulty(Difficulties.SPARTAN);
                        changed = true;
                        break;
                    case SPARTAN:
                        Toast.makeText(getBaseContext(), "Cannot make harder", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(getBaseContext(), "An error occurred please try again", Toast.LENGTH_SHORT).show();
                }
                if (changed) {
                    data.generate();
                    fillData();
                }
            }
        });

        mRestart = (Button)findViewById(R.id.restart_button);
        mRestart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private void fillData(){
        mInfoTitle.setText(Integer.toString(data.getTime()) + "min  " + data.getDifficulty().toString() );

        mLabel1.setText("");
        mAmount1.setText("");
        mLabel2.setText("");
        mAmount2.setText("");
        mLabel3.setText("");
        mAmount3.setText("");
        mLabel4.setText("");
        mAmount4.setText("");
        mLabel5.setText("");
        mAmount5.setText("");
        mLabel6.setText("");
        mAmount6.setText("");

        int index = 0;
        for(Activity x: data.getActivities()){
            index++;
            switch(index){
                case 1:
                    mLabel1.setText(x.getName());
                    mAmount1.setText(x.getReps());
                    break;
                case 2:
                    mLabel2.setText(x.getName());
                    mAmount2.setText(x.getReps());
                    break;
                case 3:
                    mLabel3.setText(x.getName());
                    mAmount3.setText(x.getReps());
                    break;
                case 4:
                    mLabel4.setText(x.getName());
                    mAmount4.setText(x.getReps());
                    break;
                case 5:
                    mLabel5.setText(x.getName());
                    mAmount5.setText(x.getReps());
                    break;
                case 6:
                    mLabel6.setText(x.getName());
                    mAmount6.setText(x.getReps());
                    break;
                default:
                    break;
            }
        }
    }
}
