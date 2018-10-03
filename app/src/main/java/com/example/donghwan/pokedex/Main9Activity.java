package com.example.donghwan.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.TextView;
import java.text.NumberFormat;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Button tomain09 = (Button) findViewById(R.id.blastoisebackbt);
        tomain09.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    String blastoisenumber = "0009";
    String blastoisetype = "물";
    String blastoisecategory = "껍질포켓몬";
    double blastoiseheight = 1.6;
    double blastoiseweight = 85.5;
    String blastoiseability = "급류";
    int blastoisehealthpoint = 79;
    int blastoiseattack = 83;
    int blastoisedefense = 100;
    int blastoisespecialattack = 85;
    int blastoisespecialdefense = 105;
    int blastoisespeed = 78;
    double blastoiseaverage = 88.33;
    int blastoisetotal = 530;
    int blastoisecatchrate = 45;
    int blastoiselevelxp = 1059860;

    public void showblastoise(View view) {
        CheckBox blastoisenumberCheckBox = (CheckBox) findViewById(R.id.blastoisenum_checkbox);
        boolean blastoisenummberA = blastoisenumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + blastoisenummberA);

        CheckBox blastoisetypeCheckBox = (CheckBox) findViewById(R.id.blastoisetype_checkbox);
        boolean blastoisetypeA = blastoisetypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + blastoisetypeA);

        CheckBox blastoisecategoryCheckBox = (CheckBox) findViewById(R.id.blastoisecategory_checkbox);
        boolean blastoisecategoryA = blastoisecategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + blastoisecategoryA);

        CheckBox blastoiseheightCheckBox = (CheckBox) findViewById(R.id.blastoiseheight_checkbox);
        boolean blastoiseheightA = blastoiseheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + blastoiseheightA);

        CheckBox blastoiseweightCheckBox = (CheckBox) findViewById(R.id.blastoiseweight_checkbox);
        boolean blastoiseweightA = blastoiseweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + blastoiseweightA);

        CheckBox blastoiseabilityCheckBox = (CheckBox) findViewById(R.id.blastoiseability_checkbox);
        boolean blastoiseabilityA = blastoiseabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + blastoiseabilityA);

        CheckBox blastoisehealthpointCheckBox = (CheckBox) findViewById(R.id.blastoisehealthpoint_checkbox);
        boolean blastoisehealthpointA = blastoisehealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + blastoisehealthpointA);

        CheckBox blastoiseattackCheckBox = (CheckBox) findViewById(R.id.blastoiseattack_checkbox);
        boolean blastoiseattackA = blastoiseattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + blastoiseattackA);

        CheckBox blastoisedefenseCheckBox = (CheckBox) findViewById(R.id.blastoisedefense_checkbox);
        boolean blastoisedefenseA = blastoisedefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + blastoisedefenseA);

        CheckBox blastoisespecialattackCheckBox = (CheckBox) findViewById(R.id.blastoisespecialattack_checkbox);
        boolean blastoisespecialattackA = blastoisespecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + blastoisespecialattackA);

        CheckBox blastoisespecialdefenseCheckBox = (CheckBox) findViewById(R.id.blastoisespecialdefense_checkbox);
        boolean blastoisespecialdefenseA = blastoisespecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + blastoisespecialdefenseA);

        CheckBox blastoisespeedCheckBox = (CheckBox) findViewById(R.id.blastoisespeed_checkbox);
        boolean blastoisespeedA = blastoisespeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + blastoisespeedA);

        CheckBox blastoiseaverageCheckBox = (CheckBox) findViewById(R.id.blastoiseaverage_checkbox);
        boolean blastoiseaverageA = blastoiseaverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + blastoiseaverageA);

        CheckBox blastoisetotalCheckBox = (CheckBox) findViewById(R.id.blastoisetotal_checkbox);
        boolean blastoisetotalA = blastoisetotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + blastoisetotalA);

        CheckBox blastoisecatchrateCheckBox = (CheckBox) findViewById(R.id.blastoisecatchrate_checkbox);
        boolean blastoisecatchrateA = blastoisecatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + blastoisecatchrateA);

        CheckBox blastoiselevelxpCheckBox = (CheckBox) findViewById(R.id.blastoiselevelxp_checkbox);
        boolean blastoiselevelxpA = blastoiselevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + blastoiselevelxpA);


        String blastoisedataMessage = blastoiseinformation(blastoisenummberA, blastoisetypeA, blastoisecategoryA,
                blastoiseheightA, blastoiseweightA, blastoiseabilityA, blastoisehealthpointA, blastoiseattackA,
                blastoisedefenseA, blastoisespecialattackA, blastoisespecialdefenseA, blastoisespeedA, blastoiseaverageA,
                blastoisetotalA, blastoisecatchrateA, blastoiselevelxpA);
        displayMessage0009(blastoisedataMessage);

    }

    private String blastoiseinformation(boolean blastoisebnumber, boolean blastoisebtype, boolean blastoisebcategory, boolean blastoisebheight,
                                        boolean blastoisebweight, boolean blastoisebability, boolean blastoisebhealthpoint, boolean blastoisebattack,
                                        boolean blastoisebdefense, boolean blastoisebspecialattack, boolean blastoisebspecialdefense,
                                        boolean blastoisebspeed, boolean blastoisebaverage, boolean blastoisebtotal, boolean blastoisebcatchrate,
                                        boolean blastoiseblevelxp)
    {
        String blastoisedataMessage = "정보: \n\n";
        if(blastoisebnumber)
            blastoisedataMessage += "\n도감번호: " + blastoisenumber;
        if(blastoisebtype)
            blastoisedataMessage += "\n타입: " + blastoisetype;
        if(blastoisebcategory)
            blastoisedataMessage += "\n분류: " + blastoisecategory;
        if(blastoisebheight)
            blastoisedataMessage += "\n키(m): " + blastoiseheight;
        if(blastoisebweight)
            blastoisedataMessage += "\n몸무게(kg): " + blastoiseweight;
        if(blastoisebability)
            blastoisedataMessage += "\n특성: " + blastoiseability;
        if(blastoisebhealthpoint)
            blastoisedataMessage += "\n\nHP: " + blastoisehealthpoint;
        if(blastoisebattack)
            blastoisedataMessage += "\n공격: " + blastoiseattack;
        if(blastoisebdefense)
            blastoisedataMessage += "\n방어: " + blastoisedefense;
        if(blastoisebspecialattack)
            blastoisedataMessage += "\n특공: " + blastoisespecialattack;
        if(blastoisebspecialdefense)
            blastoisedataMessage += "\n특방: " + blastoisespecialdefense;
        if(blastoisebspeed)
            blastoisedataMessage += "\n스피드: " + blastoisespeed;
        if(blastoisebaverage)
            blastoisedataMessage += "\n평균: " + blastoiseaverage;
        if(blastoisebtotal)
            blastoisedataMessage += "\n종합값: " + blastoisetotal;
        if(blastoisebcatchrate)
            blastoisedataMessage += "\n포획률: " + blastoisecatchrate;
        if(blastoiseblevelxp)
            blastoisedataMessage += "\nLv 100 경험치량: " + blastoiselevelxp;

        return blastoisedataMessage;
    }

    private void displayMessage0009(String message) {
        TextView blastoiseTextView = (TextView) findViewById(R.id.blastoiseinfo);
        blastoiseTextView.setText(message);
    }

}

