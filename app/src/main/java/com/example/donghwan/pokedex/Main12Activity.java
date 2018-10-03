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


public class Main12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Button tomain12 = (Button) findViewById(R.id.butterfreebackbt);
        tomain12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    String butterfreenumber = "0012";
    String butterfreetype = "벌레 / 비행";
    String butterfreecategory = "나비포켓몬";
    double butterfreeheight = 1.1;
    double butterfreeweight = 32.0;
    String butterfreeability = "복안";
    int butterfreehealthpoint = 60;
    int butterfreeattack = 45;
    int butterfreedefense = 50;
    int butterfreespecialattack = 90;
    int butterfreespecialdefense = 80;
    int butterfreespeed = 70;
    double butterfreeaverage = 65.83;
    int butterfreetotal = 395;
    int butterfreecatchrate = 45;
    int butterfreelevelxp = 1000000;

    public void showbutterfree(View view) {
        CheckBox butterfreenumberCheckBox = (CheckBox) findViewById(R.id.butterfreenum_checkbox);
        boolean butterfreenummberA = butterfreenumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + butterfreenummberA);

        CheckBox butterfreetypeCheckBox = (CheckBox) findViewById(R.id.butterfreetype_checkbox);
        boolean butterfreetypeA = butterfreetypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + butterfreetypeA);

        CheckBox butterfreecategoryCheckBox = (CheckBox) findViewById(R.id.butterfreecategory_checkbox);
        boolean butterfreecategoryA = butterfreecategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + butterfreecategoryA);

        CheckBox butterfreeheightCheckBox = (CheckBox) findViewById(R.id.butterfreeheight_checkbox);
        boolean butterfreeheightA = butterfreeheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + butterfreeheightA);

        CheckBox butterfreeweightCheckBox = (CheckBox) findViewById(R.id.butterfreeweight_checkbox);
        boolean butterfreeweightA = butterfreeweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + butterfreeweightA);

        CheckBox butterfreeabilityCheckBox = (CheckBox) findViewById(R.id.butterfreeability_checkbox);
        boolean butterfreeabilityA = butterfreeabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + butterfreeabilityA);

        CheckBox butterfreehealthpointCheckBox = (CheckBox) findViewById(R.id.butterfreehealthpoint_checkbox);
        boolean butterfreehealthpointA = butterfreehealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + butterfreehealthpointA);

        CheckBox butterfreeattackCheckBox = (CheckBox) findViewById(R.id.butterfreeattack_checkbox);
        boolean butterfreeattackA = butterfreeattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + butterfreeattackA);

        CheckBox butterfreedefenseCheckBox = (CheckBox) findViewById(R.id.butterfreedefense_checkbox);
        boolean butterfreedefenseA = butterfreedefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + butterfreedefenseA);

        CheckBox butterfreespecialattackCheckBox = (CheckBox) findViewById(R.id.butterfreespecialattack_checkbox);
        boolean butterfreespecialattackA = butterfreespecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + butterfreespecialattackA);

        CheckBox butterfreespecialdefenseCheckBox = (CheckBox) findViewById(R.id.butterfreespecialdefense_checkbox);
        boolean butterfreespecialdefenseA = butterfreespecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + butterfreespecialdefenseA);

        CheckBox butterfreespeedCheckBox = (CheckBox) findViewById(R.id.butterfreespeed_checkbox);
        boolean butterfreespeedA = butterfreespeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + butterfreespeedA);

        CheckBox butterfreeaverageCheckBox = (CheckBox) findViewById(R.id.butterfreeaverage_checkbox);
        boolean butterfreeaverageA = butterfreeaverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + butterfreeaverageA);

        CheckBox butterfreetotalCheckBox = (CheckBox) findViewById(R.id.butterfreetotal_checkbox);
        boolean butterfreetotalA = butterfreetotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + butterfreetotalA);

        CheckBox butterfreecatchrateCheckBox = (CheckBox) findViewById(R.id.butterfreecatchrate_checkbox);
        boolean butterfreecatchrateA = butterfreecatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + butterfreecatchrateA);

        CheckBox butterfreelevelxpCheckBox = (CheckBox) findViewById(R.id.butterfreelevelxp_checkbox);
        boolean butterfreelevelxpA = butterfreelevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + butterfreelevelxpA);


        String butterfreedataMessage = butterfreeinformation(butterfreenummberA, butterfreetypeA, butterfreecategoryA,
                butterfreeheightA, butterfreeweightA, butterfreeabilityA, butterfreehealthpointA, butterfreeattackA,
                butterfreedefenseA, butterfreespecialattackA, butterfreespecialdefenseA, butterfreespeedA, butterfreeaverageA,
                butterfreetotalA, butterfreecatchrateA, butterfreelevelxpA);
        displayMessage0012(butterfreedataMessage);

    }

    private String butterfreeinformation(boolean butterfreebnumber, boolean butterfreebtype, boolean butterfreebcategory, boolean butterfreebheight,
                                         boolean butterfreebweight, boolean butterfreebability, boolean butterfreebhealthpoint, boolean butterfreebattack,
                                         boolean butterfreebdefense, boolean butterfreebspecialattack, boolean butterfreebspecialdefense,
                                         boolean butterfreebspeed, boolean butterfreebaverage, boolean butterfreebtotal, boolean butterfreebcatchrate,
                                         boolean butterfreeblevelxp)
    {
        String butterfreedataMessage = "정보: \n\n";
        if(butterfreebnumber)
            butterfreedataMessage += "\n도감번호: " + butterfreenumber;
        if(butterfreebtype)
            butterfreedataMessage += "\n타입: " + butterfreetype;
        if(butterfreebcategory)
            butterfreedataMessage += "\n분류: " + butterfreecategory;
        if(butterfreebheight)
            butterfreedataMessage += "\n키(m): " + butterfreeheight;
        if(butterfreebweight)
            butterfreedataMessage += "\n몸무게(kg): " + butterfreeweight;
        if(butterfreebability)
            butterfreedataMessage += "\n특성: " + butterfreeability;
        if(butterfreebhealthpoint)
            butterfreedataMessage += "\n\nHP: " + butterfreehealthpoint;
        if(butterfreebattack)
            butterfreedataMessage += "\n공격: " + butterfreeattack;
        if(butterfreebdefense)
            butterfreedataMessage += "\n방어: " + butterfreedefense;
        if(butterfreebspecialattack)
            butterfreedataMessage += "\n특공: " + butterfreespecialattack;
        if(butterfreebspecialdefense)
            butterfreedataMessage += "\n특방: " + butterfreespecialdefense;
        if(butterfreebspeed)
            butterfreedataMessage += "\n스피드: " + butterfreespeed;
        if(butterfreebaverage)
            butterfreedataMessage += "\n평균: " + butterfreeaverage;
        if(butterfreebtotal)
            butterfreedataMessage += "\n종합값: " + butterfreetotal;
        if(butterfreebcatchrate)
            butterfreedataMessage += "\n포획률: " + butterfreecatchrate;
        if(butterfreeblevelxp)
            butterfreedataMessage += "\nLv 100 경험치량: " + butterfreelevelxp;

        return butterfreedataMessage;
    }

    private void displayMessage0012(String message) {
        TextView butterfreeTextView = (TextView) findViewById(R.id.butterfreeinfo);
        butterfreeTextView.setText(message);
    }

}

