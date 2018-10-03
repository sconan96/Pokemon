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

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Button tomain08 = (Button) findViewById(R.id.wartortlebackbt);
        tomain08.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    String wartortlenumber = "0008";
    String wartortletype = "물";
    String wartortlecategory = "거북포켓몬";
    double wartortleheight = 1.0;
    double wartortleweight = 22.5;
    String wartortleability = "급류";
    int wartortlehealthpoint = 59;
    int wartortleattack = 63;
    int wartortledefense = 80;
    int wartortlespecialattack = 65;
    int wartortlespecialdefense = 80;
    int wartortlespeed = 58;
    double wartortleaverage = 67.50;
    int wartortletotal = 405;
    int wartortlecatchrate = 45;
    int wartortlelevelxp = 1059860;

    public void showwartortle(View view) {
        CheckBox wartortlenumberCheckBox = (CheckBox) findViewById(R.id.wartortlenum_checkbox);
        boolean wartortlenummberA = wartortlenumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + wartortlenummberA);

        CheckBox wartortletypeCheckBox = (CheckBox) findViewById(R.id.wartortletype_checkbox);
        boolean wartortletypeA = wartortletypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + wartortletypeA);

        CheckBox wartortlecategoryCheckBox = (CheckBox) findViewById(R.id.wartortlecategory_checkbox);
        boolean wartortlecategoryA = wartortlecategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + wartortlecategoryA);

        CheckBox wartortleheightCheckBox = (CheckBox) findViewById(R.id.wartortleheight_checkbox);
        boolean wartortleheightA = wartortleheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + wartortleheightA);

        CheckBox wartortleweightCheckBox = (CheckBox) findViewById(R.id.wartortleweight_checkbox);
        boolean wartortleweightA = wartortleweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + wartortleweightA);

        CheckBox wartortleabilityCheckBox = (CheckBox) findViewById(R.id.wartortleability_checkbox);
        boolean wartortleabilityA = wartortleabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + wartortleabilityA);

        CheckBox wartortlehealthpointCheckBox = (CheckBox) findViewById(R.id.wartortlehealthpoint_checkbox);
        boolean wartortlehealthpointA = wartortlehealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + wartortlehealthpointA);

        CheckBox wartortleattackCheckBox = (CheckBox) findViewById(R.id.wartortleattack_checkbox);
        boolean wartortleattackA = wartortleattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + wartortleattackA);

        CheckBox wartortledefenseCheckBox = (CheckBox) findViewById(R.id.wartortledefense_checkbox);
        boolean wartortledefenseA = wartortledefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + wartortledefenseA);

        CheckBox wartortlespecialattackCheckBox = (CheckBox) findViewById(R.id.wartortlespecialattack_checkbox);
        boolean wartortlespecialattackA = wartortlespecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + wartortlespecialattackA);

        CheckBox wartortlespecialdefenseCheckBox = (CheckBox) findViewById(R.id.wartortlespecialdefense_checkbox);
        boolean wartortlespecialdefenseA = wartortlespecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + wartortlespecialdefenseA);

        CheckBox wartortlespeedCheckBox = (CheckBox) findViewById(R.id.wartortlespeed_checkbox);
        boolean wartortlespeedA = wartortlespeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + wartortlespeedA);

        CheckBox wartortleaverageCheckBox = (CheckBox) findViewById(R.id.wartortleaverage_checkbox);
        boolean wartortleaverageA = wartortleaverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + wartortleaverageA);

        CheckBox wartortletotalCheckBox = (CheckBox) findViewById(R.id.wartortletotal_checkbox);
        boolean wartortletotalA = wartortletotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + wartortletotalA);

        CheckBox wartortlecatchrateCheckBox = (CheckBox) findViewById(R.id.wartortlecatchrate_checkbox);
        boolean wartortlecatchrateA = wartortlecatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + wartortlecatchrateA);

        CheckBox wartortlelevelxpCheckBox = (CheckBox) findViewById(R.id.wartortlelevelxp_checkbox);
        boolean wartortlelevelxpA = wartortlelevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + wartortlelevelxpA);


        String wartortledataMessage = wartortleinformation(wartortlenummberA, wartortletypeA, wartortlecategoryA,
                wartortleheightA, wartortleweightA, wartortleabilityA, wartortlehealthpointA, wartortleattackA,
                wartortledefenseA, wartortlespecialattackA, wartortlespecialdefenseA, wartortlespeedA, wartortleaverageA,
                wartortletotalA, wartortlecatchrateA, wartortlelevelxpA);
        displayMessage0008(wartortledataMessage);

    }

    private String wartortleinformation(boolean wartortlebnumber, boolean wartortlebtype, boolean wartortlebcategory, boolean wartortlebheight,
                                        boolean wartortlebweight, boolean wartortlebability, boolean wartortlebhealthpoint, boolean wartortlebattack,
                                        boolean wartortlebdefense, boolean wartortlebspecialattack, boolean wartortlebspecialdefense,
                                        boolean wartortlebspeed, boolean wartortlebaverage, boolean wartortlebtotal, boolean wartortlebcatchrate,
                                        boolean wartortleblevelxp)
    {
        String wartortledataMessage = "정보: \n\n";
        if(wartortlebnumber)
            wartortledataMessage += "\n도감번호: " + wartortlenumber;
        if(wartortlebtype)
            wartortledataMessage += "\n타입: " + wartortletype;
        if(wartortlebcategory)
            wartortledataMessage += "\n분류: " + wartortlecategory;
        if(wartortlebheight)
            wartortledataMessage += "\n키(m): " + wartortleheight;
        if(wartortlebweight)
            wartortledataMessage += "\n몸무게(kg): " + wartortleweight;
        if(wartortlebability)
            wartortledataMessage += "\n특성: " + wartortleability;
        if(wartortlebhealthpoint)
            wartortledataMessage += "\n\nHP: " + wartortlehealthpoint;
        if(wartortlebattack)
            wartortledataMessage += "\n공격: " + wartortleattack;
        if(wartortlebdefense)
            wartortledataMessage += "\n방어: " + wartortledefense;
        if(wartortlebspecialattack)
            wartortledataMessage += "\n특공: " + wartortlespecialattack;
        if(wartortlebspecialdefense)
            wartortledataMessage += "\n특방: " + wartortlespecialdefense;
        if(wartortlebspeed)
            wartortledataMessage += "\n스피드: " + wartortlespeed;
        if(wartortlebaverage)
            wartortledataMessage += "\n평균: " + wartortleaverage;
        if(wartortlebtotal)
            wartortledataMessage += "\n종합값: " + wartortletotal;
        if(wartortlebcatchrate)
            wartortledataMessage += "\n포획률: " + wartortlecatchrate;
        if(wartortleblevelxp)
            wartortledataMessage += "\nLv 100 경험치량: " + wartortlelevelxp;

        return wartortledataMessage;
    }

    private void displayMessage0008(String message) {
        TextView wartortleTextView = (TextView) findViewById(R.id.wartortleinfo);
        wartortleTextView.setText(message);
    }

}
