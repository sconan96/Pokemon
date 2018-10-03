package com.example.donghwan.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.content.Intent;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    String squirtlenumber = "0007";
    String squirtletype = "물";
    String squirtlecategory = "꼬마거북포켓몬";
    double squirtleheight = 0.5;
    double squirtleweight = 9.0;
    String squirtleability = "급류";
    int squirtlehealthpoint = 44;
    int squirtleattack = 48;
    int squirtledefense = 65;
    int squirtlespecialattack = 50;
    int squirtlespecialdefense = 64;
    int squirtlespeed = 43;
    double squirtleaverage = 52.33;
    int squirtletotal = 314;
    int squirtlecatchrate = 45;
    int squirtlelevelxp = 1059860;

    public void showsquirtle(View view) {
        CheckBox squirtlenumberCheckBox = (CheckBox) findViewById(R.id.squirtlenum_checkbox);
        boolean squirtlenummberA = squirtlenumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + squirtlenummberA);

        CheckBox squirtletypeCheckBox = (CheckBox) findViewById(R.id.squirtletype_checkbox);
        boolean squirtletypeA = squirtletypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + squirtletypeA);

        CheckBox squirtlecategoryCheckBox = (CheckBox) findViewById(R.id.squirtlecategory_checkbox);
        boolean squirtlecategoryA = squirtlecategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + squirtlecategoryA);

        CheckBox squirtleheightCheckBox = (CheckBox) findViewById(R.id.squirtleheight_checkbox);
        boolean squirtleheightA = squirtleheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + squirtleheightA);

        CheckBox squirtleweightCheckBox = (CheckBox) findViewById(R.id.squirtleweight_checkbox);
        boolean squirtleweightA = squirtleweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + squirtleweightA);

        CheckBox squirtleabilityCheckBox = (CheckBox) findViewById(R.id.squirtleability_checkbox);
        boolean squirtleabilityA = squirtleabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + squirtleabilityA);

        CheckBox squirtlehealthpointCheckBox = (CheckBox) findViewById(R.id.squirtlehealthpoint_checkbox);
        boolean squirtlehealthpointA = squirtlehealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + squirtlehealthpointA);

        CheckBox squirtleattackCheckBox = (CheckBox) findViewById(R.id.squirtleattack_checkbox);
        boolean squirtleattackA = squirtleattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + squirtleattackA);

        CheckBox squirtledefenseCheckBox = (CheckBox) findViewById(R.id.squirtledefense_checkbox);
        boolean squirtledefenseA = squirtledefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + squirtledefenseA);

        CheckBox squirtlespecialattackCheckBox = (CheckBox) findViewById(R.id.squirtlespecialattack_checkbox);
        boolean squirtlespecialattackA = squirtlespecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + squirtlespecialattackA);

        CheckBox squirtlespecialdefenseCheckBox = (CheckBox) findViewById(R.id.squirtlespecialdefense_checkbox);
        boolean squirtlespecialdefenseA = squirtlespecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + squirtlespecialdefenseA);

        CheckBox squirtlespeedCheckBox = (CheckBox) findViewById(R.id.squirtlespeed_checkbox);
        boolean squirtlespeedA = squirtlespeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + squirtlespeedA);

        CheckBox squirtleaverageCheckBox = (CheckBox) findViewById(R.id.squirtleaverage_checkbox);
        boolean squirtleaverageA = squirtleaverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + squirtleaverageA);

        CheckBox squirtletotalCheckBox = (CheckBox) findViewById(R.id.squirtletotal_checkbox);
        boolean squirtletotalA = squirtletotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + squirtletotalA);

        CheckBox squirtlecatchrateCheckBox = (CheckBox) findViewById(R.id.squirtlecatchrate_checkbox);
        boolean squirtlecatchrateA = squirtlecatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + squirtlecatchrateA);

        CheckBox squirtlelevelxpCheckBox = (CheckBox) findViewById(R.id.squirtlelevelxp_checkbox);
        boolean squirtlelevelxpA = squirtlelevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + squirtlelevelxpA);


        String squirtledataMessage = squirtleinformation(squirtlenummberA, squirtletypeA, squirtlecategoryA,
                squirtleheightA, squirtleweightA, squirtleabilityA, squirtlehealthpointA, squirtleattackA,
                squirtledefenseA, squirtlespecialattackA, squirtlespecialdefenseA, squirtlespeedA, squirtleaverageA,
                squirtletotalA, squirtlecatchrateA, squirtlelevelxpA);
        displayMessage0007(squirtledataMessage);

    }

    private String squirtleinformation(boolean squirtlebnumber, boolean squirtlebtype, boolean squirtlebcategory, boolean squirtlebheight,
                                       boolean squirtlebweight, boolean squirtlebability, boolean squirtlebhealthpoint, boolean squirtlebattack,
                                       boolean squirtlebdefense, boolean squirtlebspecialattack, boolean squirtlebspecialdefense,
                                       boolean squirtlebspeed, boolean squirtlebaverage, boolean squirtlebtotal, boolean squirtlebcatchrate,
                                       boolean squirtleblevelxp)
    {
        String squirtledataMessage = "정보: \n\n";
        if(squirtlebnumber)
            squirtledataMessage += "\n도감번호: " + squirtlenumber;
        if(squirtlebtype)
            squirtledataMessage += "\n타입: " + squirtletype;
        if(squirtlebcategory)
            squirtledataMessage += "\n분류: " + squirtlecategory;
        if(squirtlebheight)
            squirtledataMessage += "\n키(m): " + squirtleheight;
        if(squirtlebweight)
            squirtledataMessage += "\n몸무게(kg): " + squirtleweight;
        if(squirtlebability)
            squirtledataMessage += "\n특성: " + squirtleability;
        if(squirtlebhealthpoint)
            squirtledataMessage += "\n\nHP: " + squirtlehealthpoint;
        if(squirtlebattack)
            squirtledataMessage += "\n공격: " + squirtleattack;
        if(squirtlebdefense)
            squirtledataMessage += "\n방어: " + squirtledefense;
        if(squirtlebspecialattack)
            squirtledataMessage += "\n특공: " + squirtlespecialattack;
        if(squirtlebspecialdefense)
            squirtledataMessage += "\n특방: " + squirtlespecialdefense;
        if(squirtlebspeed)
            squirtledataMessage += "\n스피드: " + squirtlespeed;
        if(squirtlebaverage)
            squirtledataMessage += "\n평균: " + squirtleaverage;
        if(squirtlebtotal)
            squirtledataMessage += "\n종합값: " + squirtletotal;
        if(squirtlebcatchrate)
            squirtledataMessage += "\n포획률: " + squirtlecatchrate;
        if(squirtleblevelxp)
            squirtledataMessage += "\nLv 100 경험치량: " + squirtlelevelxp;

        return squirtledataMessage;
    }

    private void displayMessage0007(String message) {
        TextView squirtleTextView = (TextView) findViewById(R.id.squirtleinfo);
        squirtleTextView.setText(message);
    }

}
