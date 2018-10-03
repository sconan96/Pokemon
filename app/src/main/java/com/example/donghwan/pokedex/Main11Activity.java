package com.example.donghwan.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.content.Intent;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }
    String metapodnumber = "0011";
    String metapodtype = "벌레";
    String metapodcategory = "번데기포켓몬";
    double metapodheight = 0.7;
    double metapodweight = 9.9;
    String metapodability = "탈피";
    int metapodhealthpoint = 50;
    int metapodattack = 20;
    int metapoddefense = 55;
    int metapodspecialattack = 25;
    int metapodspecialdefense = 25;
    int metapodspeed = 30;
    double metapodaverage = 34.17;
    int metapodtotal = 205;
    int metapodcatchrate = 120;
    int metapodlevelxp = 1000000;

    public void showmetapod(View view) {
        CheckBox metapodnumberCheckBox = (CheckBox) findViewById(R.id.metapodnum_checkbox);
        boolean metapodnummberA = metapodnumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + metapodnummberA);

        CheckBox metapodtypeCheckBox = (CheckBox) findViewById(R.id.metapodtype_checkbox);
        boolean metapodtypeA = metapodtypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + metapodtypeA);

        CheckBox metapodcategoryCheckBox = (CheckBox) findViewById(R.id.metapodcategory_checkbox);
        boolean metapodcategoryA = metapodcategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + metapodcategoryA);

        CheckBox metapodheightCheckBox = (CheckBox) findViewById(R.id.metapodheight_checkbox);
        boolean metapodheightA = metapodheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + metapodheightA);

        CheckBox metapodweightCheckBox = (CheckBox) findViewById(R.id.metapodweight_checkbox);
        boolean metapodweightA = metapodweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + metapodweightA);

        CheckBox metapodabilityCheckBox = (CheckBox) findViewById(R.id.metapodability_checkbox);
        boolean metapodabilityA = metapodabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + metapodabilityA);

        CheckBox metapodhealthpointCheckBox = (CheckBox) findViewById(R.id.metapodhealthpoint_checkbox);
        boolean metapodhealthpointA = metapodhealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + metapodhealthpointA);

        CheckBox metapodattackCheckBox = (CheckBox) findViewById(R.id.metapodattack_checkbox);
        boolean metapodattackA = metapodattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + metapodattackA);

        CheckBox metapoddefenseCheckBox = (CheckBox) findViewById(R.id.metapoddefense_checkbox);
        boolean metapoddefenseA = metapoddefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + metapoddefenseA);

        CheckBox metapodspecialattackCheckBox = (CheckBox) findViewById(R.id.metapodspecialattack_checkbox);
        boolean metapodspecialattackA = metapodspecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + metapodspecialattackA);

        CheckBox metapodspecialdefenseCheckBox = (CheckBox) findViewById(R.id.metapodspecialdefense_checkbox);
        boolean metapodspecialdefenseA = metapodspecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + metapodspecialdefenseA);

        CheckBox metapodspeedCheckBox = (CheckBox) findViewById(R.id.metapodspeed_checkbox);
        boolean metapodspeedA = metapodspeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + metapodspeedA);

        CheckBox metapodaverageCheckBox = (CheckBox) findViewById(R.id.metapodaverage_checkbox);
        boolean metapodaverageA = metapodaverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + metapodaverageA);

        CheckBox metapodtotalCheckBox = (CheckBox) findViewById(R.id.metapodtotal_checkbox);
        boolean metapodtotalA = metapodtotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + metapodtotalA);

        CheckBox metapodcatchrateCheckBox = (CheckBox) findViewById(R.id.metapodcatchrate_checkbox);
        boolean metapodcatchrateA = metapodcatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + metapodcatchrateA);

        CheckBox metapodlevelxpCheckBox = (CheckBox) findViewById(R.id.metapodlevelxp_checkbox);
        boolean metapodlevelxpA = metapodlevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + metapodlevelxpA);


        String metapoddataMessage = metapodinformation(metapodnummberA, metapodtypeA, metapodcategoryA,
                metapodheightA, metapodweightA, metapodabilityA, metapodhealthpointA, metapodattackA,
                metapoddefenseA, metapodspecialattackA, metapodspecialdefenseA, metapodspeedA, metapodaverageA,
                metapodtotalA, metapodcatchrateA, metapodlevelxpA);
        displayMessage0011(metapoddataMessage);

    }

    private String metapodinformation(boolean metapodbnumber, boolean metapodbtype, boolean metapodbcategory, boolean metapodbheight,
                                      boolean metapodbweight, boolean metapodbability, boolean metapodbhealthpoint, boolean metapodbattack,
                                      boolean metapodbdefense, boolean metapodbspecialattack, boolean metapodbspecialdefense,
                                      boolean metapodbspeed, boolean metapodbaverage, boolean metapodbtotal, boolean metapodbcatchrate,
                                      boolean metapodblevelxp)
    {
        String metapoddataMessage = "정보: \n\n";
        if(metapodbnumber)
            metapoddataMessage += "\n도감번호: " + metapodnumber;
        if(metapodbtype)
            metapoddataMessage += "\n타입: " + metapodtype;
        if(metapodbcategory)
            metapoddataMessage += "\n분류: " + metapodcategory;
        if(metapodbheight)
            metapoddataMessage += "\n키(m): " + metapodheight;
        if(metapodbweight)
            metapoddataMessage += "\n몸무게(kg): " + metapodweight;
        if(metapodbability)
            metapoddataMessage += "\n특성: " + metapodability;
        if(metapodbhealthpoint)
            metapoddataMessage += "\n\nHP: " + metapodhealthpoint;
        if(metapodbattack)
            metapoddataMessage += "\n공격: " + metapodattack;
        if(metapodbdefense)
            metapoddataMessage += "\n방어: " + metapoddefense;
        if(metapodbspecialattack)
            metapoddataMessage += "\n특공: " + metapodspecialattack;
        if(metapodbspecialdefense)
            metapoddataMessage += "\n특방: " + metapodspecialdefense;
        if(metapodbspeed)
            metapoddataMessage += "\n스피드: " + metapodspeed;
        if(metapodbaverage)
            metapoddataMessage += "\n평균: " + metapodaverage;
        if(metapodbtotal)
            metapoddataMessage += "\n종합값: " + metapodtotal;
        if(metapodbcatchrate)
            metapoddataMessage += "\n포획률: " + metapodcatchrate;
        if(metapodblevelxp)
            metapoddataMessage += "\nLv 100 경험치량: " + metapodlevelxp;

        return metapoddataMessage;
    }

    private void displayMessage0011(String message) {
        TextView metapodTextView = (TextView) findViewById(R.id.metapodinfo);
        metapodTextView.setText(message);
    }

}
