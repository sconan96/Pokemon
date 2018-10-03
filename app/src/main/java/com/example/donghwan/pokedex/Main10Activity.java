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

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Button tomain10 = (Button) findViewById(R.id.caterpiebackbt);
        tomain10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    String caterpienumber = "0010";
    String caterpietype = "벌레타입";
    String caterpiecategory = "애벌레포켓몬";
    double caterpieheight = 0.3;
    double caterpieweight = 2.9;
    String caterpieability = "인분";
    int caterpiehealthpoint = 45;
    int caterpieattack = 30;
    int caterpiedefense = 35;
    int caterpiespecialattack = 20;
    int caterpiespecialdefense = 20;
    int caterpiespeed = 45;
    double caterpieaverage = 32.50;
    int caterpietotal = 195;
    int caterpiecatchrate = 255;
    int caterpielevelxp = 1000000;

    public void showcaterpie(View view) {
        CheckBox caterpienumberCheckBox = (CheckBox) findViewById(R.id.caterpienum_checkbox);
        boolean caterpienummberA = caterpienumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + caterpienummberA);

        CheckBox caterpietypeCheckBox = (CheckBox) findViewById(R.id.caterpietype_checkbox);
        boolean caterpietypeA = caterpietypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + caterpietypeA);

        CheckBox caterpiecategoryCheckBox = (CheckBox) findViewById(R.id.caterpiecategory_checkbox);
        boolean caterpiecategoryA = caterpiecategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + caterpiecategoryA);

        CheckBox caterpieheightCheckBox = (CheckBox) findViewById(R.id.caterpieheight_checkbox);
        boolean caterpieheightA = caterpieheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + caterpieheightA);

        CheckBox caterpieweightCheckBox = (CheckBox) findViewById(R.id.caterpieweight_checkbox);
        boolean caterpieweightA = caterpieweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + caterpieweightA);

        CheckBox caterpieabilityCheckBox = (CheckBox) findViewById(R.id.caterpieability_checkbox);
        boolean caterpieabilityA = caterpieabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + caterpieabilityA);

        CheckBox caterpiehealthpointCheckBox = (CheckBox) findViewById(R.id.caterpiehealthpoint_checkbox);
        boolean caterpiehealthpointA = caterpiehealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + caterpiehealthpointA);

        CheckBox caterpieattackCheckBox = (CheckBox) findViewById(R.id.caterpieattack_checkbox);
        boolean caterpieattackA = caterpieattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + caterpieattackA);

        CheckBox caterpiedefenseCheckBox = (CheckBox) findViewById(R.id.caterpiedefense_checkbox);
        boolean caterpiedefenseA = caterpiedefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + caterpiedefenseA);

        CheckBox caterpiespecialattackCheckBox = (CheckBox) findViewById(R.id.caterpiespecialattack_checkbox);
        boolean caterpiespecialattackA = caterpiespecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + caterpiespecialattackA);

        CheckBox caterpiespecialdefenseCheckBox = (CheckBox) findViewById(R.id.caterpiespecialdefense_checkbox);
        boolean caterpiespecialdefenseA = caterpiespecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + caterpiespecialdefenseA);

        CheckBox caterpiespeedCheckBox = (CheckBox) findViewById(R.id.caterpiespeed_checkbox);
        boolean caterpiespeedA = caterpiespeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + caterpiespeedA);

        CheckBox caterpieaverageCheckBox = (CheckBox) findViewById(R.id.caterpieaverage_checkbox);
        boolean caterpieaverageA = caterpieaverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + caterpieaverageA);

        CheckBox caterpietotalCheckBox = (CheckBox) findViewById(R.id.caterpietotal_checkbox);
        boolean caterpietotalA = caterpietotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + caterpietotalA);

        CheckBox caterpiecatchrateCheckBox = (CheckBox) findViewById(R.id.caterpiecatchrate_checkbox);
        boolean caterpiecatchrateA = caterpiecatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + caterpiecatchrateA);

        CheckBox caterpielevelxpCheckBox = (CheckBox) findViewById(R.id.caterpielevelxp_checkbox);
        boolean caterpielevelxpA = caterpielevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + caterpielevelxpA);


        String caterpiedataMessage = caterpieinformation(caterpienummberA, caterpietypeA, caterpiecategoryA,
                caterpieheightA, caterpieweightA, caterpieabilityA, caterpiehealthpointA, caterpieattackA,
                caterpiedefenseA, caterpiespecialattackA, caterpiespecialdefenseA, caterpiespeedA, caterpieaverageA,
                caterpietotalA, caterpiecatchrateA, caterpielevelxpA);
        displayMessage0010(caterpiedataMessage);

    }

    private String caterpieinformation(boolean caterpiebnumber, boolean caterpiebtype, boolean caterpiebcategory, boolean caterpiebheight,
                                       boolean caterpiebweight, boolean caterpiebability, boolean caterpiebhealthpoint, boolean caterpiebattack,
                                       boolean caterpiebdefense, boolean caterpiebspecialattack, boolean caterpiebspecialdefense,
                                       boolean caterpiebspeed, boolean caterpiebaverage, boolean caterpiebtotal, boolean caterpiebcatchrate,
                                       boolean caterpieblevelxp)
    {
        String caterpiedataMessage = "정보: \n\n";
        if(caterpiebnumber)
            caterpiedataMessage += "\n도감번호: " + caterpienumber;
        if(caterpiebtype)
            caterpiedataMessage += "\n타입: " + caterpietype;
        if(caterpiebcategory)
            caterpiedataMessage += "\n분류: " + caterpiecategory;
        if(caterpiebheight)
            caterpiedataMessage += "\n키(m): " + caterpieheight;
        if(caterpiebweight)
            caterpiedataMessage += "\n몸무게(kg): " + caterpieweight;
        if(caterpiebability)
            caterpiedataMessage += "\n특성: " + caterpieability;
        if(caterpiebhealthpoint)
            caterpiedataMessage += "\n\nHP: " + caterpiehealthpoint;
        if(caterpiebattack)
            caterpiedataMessage += "\n공격: " + caterpieattack;
        if(caterpiebdefense)
            caterpiedataMessage += "\n방어: " + caterpiedefense;
        if(caterpiebspecialattack)
            caterpiedataMessage += "\n특공: " + caterpiespecialattack;
        if(caterpiebspecialdefense)
            caterpiedataMessage += "\n특방: " + caterpiespecialdefense;
        if(caterpiebspeed)
            caterpiedataMessage += "\n스피드: " + caterpiespeed;
        if(caterpiebaverage)
            caterpiedataMessage += "\n평균: " + caterpieaverage;
        if(caterpiebtotal)
            caterpiedataMessage += "\n종합값: " + caterpietotal;
        if(caterpiebcatchrate)
            caterpiedataMessage += "\n포획률: " + caterpiecatchrate;
        if(caterpieblevelxp)
            caterpiedataMessage += "\nLv 100 경험치량: " + caterpielevelxp;

        return caterpiedataMessage;
    }

    private void displayMessage0010(String message) {
        TextView caterpieTextView = (TextView) findViewById(R.id.caterpieinfo);
        caterpieTextView.setText(message);
    }

}

