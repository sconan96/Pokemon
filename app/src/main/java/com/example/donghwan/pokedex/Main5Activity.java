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

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button tomain05 = (Button) findViewById(R.id.charmeleonbackbt);
        tomain05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    String charmeleonnumber = "0005";
    String charmeleontype = "불";
    String charmeleoncategory = "화염포켓몬";
    double charmeleonheight = 1.1;
    double charmeleonweight = 19.0;
    String charmeleonability = "맹화";
    int charmeleonhealthpoint = 58;
    int charmeleonattack = 64;
    int charmeleondefense = 58;
    int charmeleonspecialattack = 80;
    int charmeleonspecialdefense = 65;
    int charmeleonspeed = 80;
    double charmeleonaverage = 67.50;
    int charmeleontotal = 405;
    int charmeleoncatchrate = 45;
    int charmeleonlevelxp = 1059860;

    public void showcharmeleon(View view) {
        CheckBox charmeleonnumberCheckBox = (CheckBox) findViewById(R.id.charmeleonnum_checkbox);
        boolean charmeleonnummberA = charmeleonnumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + charmeleonnummberA);

        CheckBox charmeleontypeCheckBox = (CheckBox) findViewById(R.id.charmeleontype_checkbox);
        boolean charmeleontypeA = charmeleontypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + charmeleontypeA);

        CheckBox charmeleoncategoryCheckBox = (CheckBox) findViewById(R.id.charmeleoncategory_checkbox);
        boolean charmeleoncategoryA = charmeleoncategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + charmeleoncategoryA);

        CheckBox charmeleonheightCheckBox = (CheckBox) findViewById(R.id.charmeleonheight_checkbox);
        boolean charmeleonheightA = charmeleonheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + charmeleonheightA);

        CheckBox charmeleonweightCheckBox = (CheckBox) findViewById(R.id.charmeleonweight_checkbox);
        boolean charmeleonweightA = charmeleonweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + charmeleonweightA);

        CheckBox charmeleonabilityCheckBox = (CheckBox) findViewById(R.id.charmeleonability_checkbox);
        boolean charmeleonabilityA = charmeleonabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + charmeleonabilityA);

        CheckBox charmeleonhealthpointCheckBox = (CheckBox) findViewById(R.id.charmeleonhealthpoint_checkbox);
        boolean charmeleonhealthpointA = charmeleonhealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + charmeleonhealthpointA);

        CheckBox charmeleonattackCheckBox = (CheckBox) findViewById(R.id.charmeleonattack_checkbox);
        boolean charmeleonattackA = charmeleonattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + charmeleonattackA);

        CheckBox charmeleondefenseCheckBox = (CheckBox) findViewById(R.id.charmeleondefense_checkbox);
        boolean charmeleondefenseA = charmeleondefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + charmeleondefenseA);

        CheckBox charmeleonspecialattackCheckBox = (CheckBox) findViewById(R.id.charmeleonspecialattack_checkbox);
        boolean charmeleonspecialattackA = charmeleonspecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + charmeleonspecialattackA);

        CheckBox charmeleonspecialdefenseCheckBox = (CheckBox) findViewById(R.id.charmeleonspecialdefense_checkbox);
        boolean charmeleonspecialdefenseA = charmeleonspecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + charmeleonspecialdefenseA);

        CheckBox charmeleonspeedCheckBox = (CheckBox) findViewById(R.id.charmeleonspeed_checkbox);
        boolean charmeleonspeedA = charmeleonspeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + charmeleonspeedA);

        CheckBox charmeleonaverageCheckBox = (CheckBox) findViewById(R.id.charmeleonaverage_checkbox);
        boolean charmeleonaverageA = charmeleonaverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + charmeleonaverageA);

        CheckBox charmeleontotalCheckBox = (CheckBox) findViewById(R.id.charmeleontotal_checkbox);
        boolean charmeleontotalA = charmeleontotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + charmeleontotalA);

        CheckBox charmeleoncatchrateCheckBox = (CheckBox) findViewById(R.id.charmeleoncatchrate_checkbox);
        boolean charmeleoncatchrateA = charmeleoncatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + charmeleoncatchrateA);

        CheckBox charmeleonlevelxpCheckBox = (CheckBox) findViewById(R.id.charmeleonlevelxp_checkbox);
        boolean charmeleonlevelxpA = charmeleonlevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + charmeleonlevelxpA);


        String charmeleondataMessage = charmeleoninformation(charmeleonnummberA, charmeleontypeA, charmeleoncategoryA,
                charmeleonheightA, charmeleonweightA, charmeleonabilityA, charmeleonhealthpointA, charmeleonattackA,
                charmeleondefenseA, charmeleonspecialattackA, charmeleonspecialdefenseA, charmeleonspeedA, charmeleonaverageA,
                charmeleontotalA, charmeleoncatchrateA, charmeleonlevelxpA);
        displayMessage0005(charmeleondataMessage);

    }

    private String charmeleoninformation(boolean charmeleonbnumber, boolean charmeleonbtype, boolean charmeleonbcategory, boolean charmeleonbheight,
                                         boolean charmeleonbweight, boolean charmeleonbability, boolean charmeleonbhealthpoint, boolean charmeleonbattack,
                                         boolean charmeleonbdefense, boolean charmeleonbspecialattack, boolean charmeleonbspecialdefense,
                                         boolean charmeleonbspeed, boolean charmeleonbaverage, boolean charmeleonbtotal, boolean charmeleonbcatchrate,
                                         boolean charmeleonblevelxp)
    {
        String charmeleondataMessage = "정보: \n\n";
        if(charmeleonbnumber)
            charmeleondataMessage += "\n도감번호: " + charmeleonnumber;
        if(charmeleonbtype)
            charmeleondataMessage += "\n타입: " + charmeleontype;
        if(charmeleonbcategory)
            charmeleondataMessage += "\n분류: " + charmeleoncategory;
        if(charmeleonbheight)
            charmeleondataMessage += "\n키(m): " + charmeleonheight;
        if(charmeleonbweight)
            charmeleondataMessage += "\n몸무게(kg): " + charmeleonweight;
        if(charmeleonbability)
            charmeleondataMessage += "\n특성: " + charmeleonability;
        if(charmeleonbhealthpoint)
            charmeleondataMessage += "\n\nHP: " + charmeleonhealthpoint;
        if(charmeleonbattack)
            charmeleondataMessage += "\n공격: " + charmeleonattack;
        if(charmeleonbdefense)
            charmeleondataMessage += "\n방어: " + charmeleondefense;
        if(charmeleonbspecialattack)
            charmeleondataMessage += "\n특공: " + charmeleonspecialattack;
        if(charmeleonbspecialdefense)
            charmeleondataMessage += "\n특방: " + charmeleonspecialdefense;
        if(charmeleonbspeed)
            charmeleondataMessage += "\n스피드: " + charmeleonspeed;
        if(charmeleonbaverage)
            charmeleondataMessage += "\n평균: " + charmeleonaverage;
        if(charmeleonbtotal)
            charmeleondataMessage += "\n종합값: " + charmeleontotal;
        if(charmeleonbcatchrate)
            charmeleondataMessage += "\n포획률: " + charmeleoncatchrate;
        if(charmeleonblevelxp)
            charmeleondataMessage += "\nLv 100 경험치량: " + charmeleonlevelxp;

        return charmeleondataMessage;
    }

    private void displayMessage0005(String message) {
        TextView charmeleonTextView = (TextView) findViewById(R.id.charmeleoninfo);
        charmeleonTextView.setText(message);
    }

}
