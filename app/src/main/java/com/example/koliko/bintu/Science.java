package com.example.koliko.bintu;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Science extends AppCompatActivity {
    int score=10;

    private RadioGroup radioGroup;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    private RadioGroup radioGroup6;
    private RadioGroup radioGroup7;
    private RadioGroup radioGroup8;
    private RadioGroup radioGroup9;
    private RadioGroup radioGroup10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        //do something on the radio group
       radioGroup =  findViewById(R.id.radioGroup1);
       radioGroup2 =  findViewById(R.id.radioGroup2);
       radioGroup3 = findViewById(R.id.radioGroup3);
       radioGroup4 = findViewById(R.id.radioGroup4);
       radioGroup5 = findViewById(R.id.radioGroup5);
       radioGroup6 = findViewById(R.id.radioGroup6);
       radioGroup7 = findViewById(R.id.radioGroup7);
       radioGroup8 = findViewById(R.id.radioGroup8);
       radioGroup9 = findViewById(R.id.radioGroup9);
       radioGroup10 = findViewById(R.id.radioGroup10);
       radioGroup.clearCheck();
       radioGroup2.clearCheck();
       radioGroup3.clearCheck();
       radioGroup4.clearCheck();
       radioGroup5.clearCheck();
       radioGroup6.clearCheck();
       radioGroup7.clearCheck();
       radioGroup8.clearCheck();
       radioGroup9.clearCheck();
       radioGroup10.clearCheck();

       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @SuppressLint("ResourceType")
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               RadioButton rdButton = group.findViewById(checkedId);
               //Condition to check when the wrong answer is checked
               if(rdButton==findViewById(R.id.sci_qus1_ans3)){
                   Toast.makeText(Science.this, "Correct for +1 point", Toast.LENGTH_SHORT);
               }else {
                   Toast.makeText(Science.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
               }
           }
       });

       radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               RadioButton rdButton = group.findViewById(checkedId);
               //condition to check radio click
               if(rdButton==findViewById(R.id.sci_qus2_ans3)){
                   Toast.makeText(Science.this,"Correct for 1 point" +score,Toast.LENGTH_SHORT).show();
               }else{
                   Toast.makeText(Science.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
               }
           }
       });
       radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               RadioButton rdButton = group.findViewById(checkedId);
               //condition to check
               if(rdButton==findViewById(R.id.sci_qus3_ans1)){
                   Toast.makeText(Science.this,"Correct for 1 point" +score,Toast.LENGTH_SHORT).show();
               }else{
                   Toast.makeText(Science.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
               }
           }
       });
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdButton = group.findViewById(checkedId);
                //Condition to check when the wrong answer is checked
                if(rdButton==findViewById(R.id.sci_qus4_ans2)){

                    Toast.makeText(Science.this, "Correct for +1 point", Toast.LENGTH_SHORT);
                }else {
                    Toast.makeText(Science.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdButton = group.findViewById(checkedId);
                //condition to check radio click
                if(rdButton==findViewById(R.id.sci_qus5_ans1)){
                    Toast.makeText(Science.this,"Correct for 1 point" +score,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Science.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdButton = group.findViewById(checkedId);
                //condition to check
                if(rdButton==findViewById(R.id.sci_qus6_ans1)){
                    Toast.makeText(Science.this,"Correct for 1 point" +score,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Science.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdButton = group.findViewById(checkedId);
                //Condition to check when the wrong answer is checked
                if(rdButton==findViewById(R.id.sci_qus7_ans1)){
                    Toast.makeText(Science.this, "Correct for +1 point", Toast.LENGTH_SHORT);
                }else {
                    Toast.makeText(Science.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdButton = group.findViewById(checkedId);
                //condition to check radio click
                if(rdButton==findViewById(R.id.sci_qus8_ans3)){
                    Toast.makeText(Science.this,"Correct for 1 point" +score,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Science.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdButton = group.findViewById(checkedId);
                //condition to check
                if(rdButton==findViewById(R.id.sci_qus9_ans1)){
                    Toast.makeText(Science.this,"Correct for 1 point" +score,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Science.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        radioGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdButton = group.findViewById(checkedId);
                //condition to check
                if(rdButton==findViewById(R.id.sci_qus10_ans1)){
                    Toast.makeText(Science.this,"Correct for 1 point" +score,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Science.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
