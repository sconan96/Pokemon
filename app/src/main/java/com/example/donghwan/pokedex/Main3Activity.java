package com.example.donghwan.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.content.Intent;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    String venusaurnumber = "0003";
    String venusaurtype = "풀 / 독";
    String venusaurcategory = "씨앗포켓몬";
    double venusaurheight = 2.0;
    double venusaurweight = 100.0;
    String venusaurability = "심록";
    int venusaurhealthpoint = 80;
    int venusaurattack = 82;
    int venusaurdefense = 83;
    int venusaurspecialattack = 100;
    int venusaurspecialdefense = 100;
    int venusaurspeed = 80;
    double venusauraverage = 87.50;
    int venusaurtotal = 525;
    int venusaurcatchrate = 45;
    int venusaurlevelxp = 1059860;

    public void showvenusaur(View view) {
        CheckBox venusaurnumberCheckBox = (CheckBox) findViewById(R.id.venusaurnum_checkbox);
        boolean venusaurnummberA = venusaurnumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + venusaurnummberA);

        CheckBox venusaurtypeCheckBox = (CheckBox) findViewById(R.id.venusaurtype_checkbox);
        boolean venusaurtypeA = venusaurtypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + venusaurtypeA);

        CheckBox venusaurcategoryCheckBox = (CheckBox) findViewById(R.id.venusaurcategory_checkbox);
        boolean venusaurcategoryA = venusaurcategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + venusaurcategoryA);

        CheckBox venusaurheightCheckBox = (CheckBox) findViewById(R.id.venusaurheight_checkbox);
        boolean venusaurheightA = venusaurheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + venusaurheightA);

        CheckBox venusaurweightCheckBox = (CheckBox) findViewById(R.id.venusaurweight_checkbox);
        boolean venusaurweightA = venusaurweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + venusaurweightA);

        CheckBox venusaurabilityCheckBox = (CheckBox) findViewById(R.id.venusaurability_checkbox);
        boolean venusaurabilityA = venusaurabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + venusaurabilityA);

        CheckBox venusaurhealthpointCheckBox = (CheckBox) findViewById(R.id.venusaurhealthpoint_checkbox);
        boolean venusaurhealthpointA = venusaurhealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + venusaurhealthpointA);

        CheckBox venusaurattackCheckBox = (CheckBox) findViewById(R.id.venusaurattack_checkbox);
        boolean venusaurattackA = venusaurattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + venusaurattackA);

        CheckBox venusaurdefenseCheckBox = (CheckBox) findViewById(R.id.venusaurdefense_checkbox);
        boolean venusaurdefenseA = venusaurdefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + venusaurdefenseA);

        CheckBox venusaurspecialattackCheckBox = (CheckBox) findViewById(R.id.venusaurspecialattack_checkbox);
        boolean venusaurspecialattackA = venusaurspecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + venusaurspecialattackA);

        CheckBox venusaurspecialdefenseCheckBox = (CheckBox) findViewById(R.id.venusaurspecialdefense_checkbox);
        boolean venusaurspecialdefenseA = venusaurspecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + venusaurspecialdefenseA);

        CheckBox venusaurspeedCheckBox = (CheckBox) findViewById(R.id.venusaurspeed_checkbox);
        boolean venusaurspeedA = venusaurspeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + venusaurspeedA);

        CheckBox venusauraverageCheckBox = (CheckBox) findViewById(R.id.venusauraverage_checkbox);
        boolean venusauraverageA = venusauraverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + venusauraverageA);

        CheckBox venusaurtotalCheckBox = (CheckBox) findViewById(R.id.venusaurtotal_checkbox);
        boolean venusaurtotalA = venusaurtotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + venusaurtotalA);

        CheckBox venusaurcatchrateCheckBox = (CheckBox) findViewById(R.id.venusaurcatchrate_checkbox);
        boolean venusaurcatchrateA = venusaurcatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + venusaurcatchrateA);

        CheckBox venusaurlevelxpCheckBox = (CheckBox) findViewById(R.id.venusaurlevelxp_checkbox);
        boolean venusaurlevelxpA = venusaurlevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + venusaurlevelxpA);


        String venusaurdataMessage = venusaurinformation(venusaurnummberA, venusaurtypeA, venusaurcategoryA,
                venusaurheightA, venusaurweightA, venusaurabilityA, venusaurhealthpointA, venusaurattackA,
                venusaurdefenseA, venusaurspecialattackA, venusaurspecialdefenseA, venusaurspeedA, venusauraverageA,
                venusaurtotalA, venusaurcatchrateA, venusaurlevelxpA);
        displayMessage0003(venusaurdataMessage);

    }

    private String venusaurinformation(boolean venusaurbnumber, boolean venusaurbtype, boolean venusaurbcategory, boolean venusaurbheight,
                                       boolean venusaurbweight, boolean venusaurbability, boolean venusaurbhealthpoint, boolean venusaurbattack,
                                       boolean venusaurbdefense, boolean venusaurbspecialattack, boolean venusaurbspecialdefense,
                                       boolean venusaurbspeed, boolean venusaurbaverage, boolean venusaurbtotal, boolean venusaurbcatchrate,
                                       boolean venusaurblevelxp)
    {
        String venusaurdataMessage = "정보: \n\n";
        if(venusaurbnumber)
            venusaurdataMessage += "\n도감번호: " + venusaurnumber;
        if(venusaurbtype)
            venusaurdataMessage += "\n타입: " + venusaurtype;
        if(venusaurbcategory)
            venusaurdataMessage += "\n분류: " + venusaurcategory;
        if(venusaurbheight)
            venusaurdataMessage += "\n키(m): " + venusaurheight;
        if(venusaurbweight)
            venusaurdataMessage += "\n몸무게(kg): " + venusaurweight;
        if(venusaurbability)
            venusaurdataMessage += "\n특성: " + venusaurability;
        if(venusaurbhealthpoint)
            venusaurdataMessage += "\n\nHP: " + venusaurhealthpoint;
        if(venusaurbattack)
            venusaurdataMessage += "\n공격: " + venusaurattack;
        if(venusaurbdefense)
            venusaurdataMessage += "\n방어: " + venusaurdefense;
        if(venusaurbspecialattack)
            venusaurdataMessage += "\n특공: " + venusaurspecialattack;
        if(venusaurbspecialdefense)
            venusaurdataMessage += "\n특방: " + venusaurspecialdefense;
        if(venusaurbspeed)
            venusaurdataMessage += "\n스피드: " + venusaurspeed;
        if(venusaurbaverage)
            venusaurdataMessage += "\n평균: " + venusauraverage;
        if(venusaurbtotal)
            venusaurdataMessage += "\n종합값: " + venusaurtotal;
        if(venusaurbcatchrate)
            venusaurdataMessage += "\n포획률: " + venusaurcatchrate;
        if(venusaurblevelxp)
            venusaurdataMessage += "\nLv 100 경험치량: " + venusaurlevelxp;

        return venusaurdataMessage;
    }

    private void displayMessage0003(String message) {
        TextView venusaurTextView = (TextView) findViewById(R.id.venusaurinfo);
        venusaurTextView.setText(message);
    }

}
