package com.example.donghwan.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.content.Intent;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    String charmandernumber = "0004";
    String charmandertype = "불";
    String charmandercategory = "도룡뇽포켓몬";
    double charmanderheight = 0.6;
    double charmanderweight = 8.5;
    String charmanderability = "맹화";
    int charmanderhealthpoint = 39;
    int charmanderattack = 52;
    int charmanderdefense = 43;
    int charmanderspecialattack = 60;
    int charmanderspecialdefense = 50;
    int charmanderspeed = 65;
    double charmanderaverage = 51.50;
    int charmandertotal = 309;
    int charmandercatchrate = 45;
    int charmanderlevelxp = 1059860;

    public void showcharmander(View view) {
        CheckBox charmandernumberCheckBox = (CheckBox) findViewById(R.id.charmandernum_checkbox);
        boolean charmandernummberA = charmandernumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + charmandernummberA);

        CheckBox charmandertypeCheckBox = (CheckBox) findViewById(R.id.charmandertype_checkbox);
        boolean charmandertypeA = charmandertypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + charmandertypeA);

        CheckBox charmandercategoryCheckBox = (CheckBox) findViewById(R.id.charmandercategory_checkbox);
        boolean charmandercategoryA = charmandercategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + charmandercategoryA);

        CheckBox charmanderheightCheckBox = (CheckBox) findViewById(R.id.charmanderheight_checkbox);
        boolean charmanderheightA = charmanderheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + charmanderheightA);

        CheckBox charmanderweightCheckBox = (CheckBox) findViewById(R.id.charmanderweight_checkbox);
        boolean charmanderweightA = charmanderweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + charmanderweightA);

        CheckBox charmanderabilityCheckBox = (CheckBox) findViewById(R.id.charmanderability_checkbox);
        boolean charmanderabilityA = charmanderabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + charmanderabilityA);

        CheckBox charmanderhealthpointCheckBox = (CheckBox) findViewById(R.id.charmanderhealthpoint_checkbox);
        boolean charmanderhealthpointA = charmanderhealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + charmanderhealthpointA);

        CheckBox charmanderattackCheckBox = (CheckBox) findViewById(R.id.charmanderattack_checkbox);
        boolean charmanderattackA = charmanderattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + charmanderattackA);

        CheckBox charmanderdefenseCheckBox = (CheckBox) findViewById(R.id.charmanderdefense_checkbox);
        boolean charmanderdefenseA = charmanderdefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + charmanderdefenseA);

        CheckBox charmanderspecialattackCheckBox = (CheckBox) findViewById(R.id.charmanderspecialattack_checkbox);
        boolean charmanderspecialattackA = charmanderspecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + charmanderspecialattackA);

        CheckBox charmanderspecialdefenseCheckBox = (CheckBox) findViewById(R.id.charmanderspecialdefense_checkbox);
        boolean charmanderspecialdefenseA = charmanderspecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + charmanderspecialdefenseA);

        CheckBox charmanderspeedCheckBox = (CheckBox) findViewById(R.id.charmanderspeed_checkbox);
        boolean charmanderspeedA = charmanderspeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + charmanderspeedA);

        CheckBox charmanderaverageCheckBox = (CheckBox) findViewById(R.id.charmanderaverage_checkbox);
        boolean charmanderaverageA = charmanderaverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + charmanderaverageA);

        CheckBox charmandertotalCheckBox = (CheckBox) findViewById(R.id.charmandertotal_checkbox);
        boolean charmandertotalA = charmandertotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + charmandertotalA);

        CheckBox charmandercatchrateCheckBox = (CheckBox) findViewById(R.id.charmandercatchrate_checkbox);
        boolean charmandercatchrateA = charmandercatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + charmandercatchrateA);

        CheckBox charmanderlevelxpCheckBox = (CheckBox) findViewById(R.id.charmanderlevelxp_checkbox);
        boolean charmanderlevelxpA = charmanderlevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + charmanderlevelxpA);


        String charmanderdataMessage = charmanderinformation(charmandernummberA, charmandertypeA, charmandercategoryA,
                charmanderheightA, charmanderweightA, charmanderabilityA, charmanderhealthpointA, charmanderattackA,
                charmanderdefenseA, charmanderspecialattackA, charmanderspecialdefenseA, charmanderspeedA, charmanderaverageA,
                charmandertotalA, charmandercatchrateA, charmanderlevelxpA);
        displayMessage0004(charmanderdataMessage);

    }

    private String charmanderinformation(boolean charmanderbnumber, boolean charmanderbtype, boolean charmanderbcategory, boolean charmanderbheight,
                                         boolean charmanderbweight, boolean charmanderbability, boolean charmanderbhealthpoint, boolean charmanderbattack,
                                         boolean charmanderbdefense, boolean charmanderbspecialattack, boolean charmanderbspecialdefense,
                                         boolean charmanderbspeed, boolean charmanderbaverage, boolean charmanderbtotal, boolean charmanderbcatchrate,
                                         boolean charmanderblevelxp)
    {
        String charmanderdataMessage = "정보: \n\n";
        if(charmanderbnumber)
            charmanderdataMessage += "\n도감번호: " + charmandernumber;
        if(charmanderbtype)
            charmanderdataMessage += "\n타입: " + charmandertype;
        if(charmanderbcategory)
            charmanderdataMessage += "\n분류: " + charmandercategory;
        if(charmanderbheight)
            charmanderdataMessage += "\n키(m): " + charmanderheight;
        if(charmanderbweight)
            charmanderdataMessage += "\n몸무게(kg): " + charmanderweight;
        if(charmanderbability)
            charmanderdataMessage += "\n특성: " + charmanderability;
        if(charmanderbhealthpoint)
            charmanderdataMessage += "\n\nHP: " + charmanderhealthpoint;
        if(charmanderbattack)
            charmanderdataMessage += "\n공격: " + charmanderattack;
        if(charmanderbdefense)
            charmanderdataMessage += "\n방어: " + charmanderdefense;
        if(charmanderbspecialattack)
            charmanderdataMessage += "\n특공: " + charmanderspecialattack;
        if(charmanderbspecialdefense)
            charmanderdataMessage += "\n특방: " + charmanderspecialdefense;
        if(charmanderbspeed)
            charmanderdataMessage += "\n스피드: " + charmanderspeed;
        if(charmanderbaverage)
            charmanderdataMessage += "\n평균: " + charmanderaverage;
        if(charmanderbtotal)
            charmanderdataMessage += "\n종합값: " + charmandertotal;
        if(charmanderbcatchrate)
            charmanderdataMessage += "\n포획률: " + charmandercatchrate;
        if(charmanderblevelxp)
            charmanderdataMessage += "\nLv 100 경험치량: " + charmanderlevelxp;

        return charmanderdataMessage;
    }

    private void displayMessage0004(String message) {
        TextView charmanderTextView = (TextView) findViewById(R.id.charmanderinfo);
        charmanderTextView.setText(message);
    }

}
