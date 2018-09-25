package com.example.koliko.bintu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting the content of the science field to use the activity_science.xml file
        TextView science = (TextView) findViewById(R.id.science);
        //set the onClickLister on the science textview
        science.setOnClickListener(new View.OnClickListener() {
            //The code in this block will be executed when the science button is click
            @Override
            public void onClick(View v) {
                Intent scienceIntent = new Intent(MainActivity.this, Science.class);
                startActivity(scienceIntent);

            }
        });
        //setting the content of the mathematics field to use the activity_mathematics.xml file
        final TextView mathematics = (TextView) findViewById(R.id.mathematics);
        mathematics.setOnClickListener(new View.OnClickListener() {
            //The code in this block will be executed when the math button is clicked
            @Override
            public void onClick(View v) {
                Intent mathematicsIntent = new Intent(MainActivity.this, Mathematics.class);
                startActivity(mathematicsIntent);

            }
        });
        //setting the content of the English field to use the activity_english.xml file
        TextView english = (TextView) findViewById(R.id.english);
        english.setOnClickListener(new View.OnClickListener() {
            //This code will be executed when the english button is clicked
            @Override
            public void onClick(View v) {
                Intent englishIntent = new Intent(MainActivity.this, English.class);
                startActivity(englishIntent);
            }
        });
        //setting the content of the instruction field to use the activity_instruction.xml file
        TextView instruction = (TextView) findViewById(R.id.instructin);
        instruction.setOnClickListener(new View.OnClickListener() {
            //This code will be executed when the instruction button is clicked
            @Override
            public void onClick(View v) {
                Intent instructionIntent = new Intent(MainActivity.this, Instruction.class);
                startActivity(instructionIntent);

            }
        });
        //setting the content of the high score field to use the activity_high_score.xml fiel
        final TextView highScore = (TextView) findViewById(R.id.high_score);
        highScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent highScoreIntent = new Intent(MainActivity.this,  High_Score.class);
                startActivity(highScoreIntent);
            }
        });

    }
}
