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

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button tomain06 = (Button) findViewById(R.id.charizardbackbt);
        tomain06.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    String charizardnumber = "0006";
    String charizardtype = "불 / 비행";
    String charizardcategory = "화염포켓몬";
    double charizardheight = 1.7;
    double charizardweight = 90.5;
    String charizardability = "맹화";
    int charizardhealthpoint = 78;
    int charizardattack = 84;
    int charizarddefense = 78;
    int charizardspecialattack = 109;
    int charizardspecialdefense = 85;
    int charizardspeed = 100;
    double charizardaverage = 89.00;
    int charizardtotal = 534;
    int charizardcatchrate = 45;
    int charizardlevelxp = 1059860;

    public void showcharizard(View view) {
        CheckBox charizardnumberCheckBox = (CheckBox) findViewById(R.id.charizardnum_checkbox);
        boolean charizardnummberA = charizardnumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + charizardnummberA);

        CheckBox charizardtypeCheckBox = (CheckBox) findViewById(R.id.charizardtype_checkbox);
        boolean charizardtypeA = charizardtypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + charizardtypeA);

        CheckBox charizardcategoryCheckBox = (CheckBox) findViewById(R.id.charizardcategory_checkbox);
        boolean charizardcategoryA = charizardcategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + charizardcategoryA);

        CheckBox charizardheightCheckBox = (CheckBox) findViewById(R.id.charizardheight_checkbox);
        boolean charizardheightA = charizardheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + charizardheightA);

        CheckBox charizardweightCheckBox = (CheckBox) findViewById(R.id.charizardweight_checkbox);
        boolean charizardweightA = charizardweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + charizardweightA);

        CheckBox charizardabilityCheckBox = (CheckBox) findViewById(R.id.charizardability_checkbox);
        boolean charizardabilityA = charizardabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + charizardabilityA);

        CheckBox charizardhealthpointCheckBox = (CheckBox) findViewById(R.id.charizardhealthpoint_checkbox);
        boolean charizardhealthpointA = charizardhealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + charizardhealthpointA);

        CheckBox charizardattackCheckBox = (CheckBox) findViewById(R.id.charizardattack_checkbox);
        boolean charizardattackA = charizardattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + charizardattackA);

        CheckBox charizarddefenseCheckBox = (CheckBox) findViewById(R.id.charizarddefense_checkbox);
        boolean charizarddefenseA = charizarddefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + charizarddefenseA);

        CheckBox charizardspecialattackCheckBox = (CheckBox) findViewById(R.id.charizardspecialattack_checkbox);
        boolean charizardspecialattackA = charizardspecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + charizardspecialattackA);

        CheckBox charizardspecialdefenseCheckBox = (CheckBox) findViewById(R.id.charizardspecialdefense_checkbox);
        boolean charizardspecialdefenseA = charizardspecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + charizardspecialdefenseA);

        CheckBox charizardspeedCheckBox = (CheckBox) findViewById(R.id.charizardspeed_checkbox);
        boolean charizardspeedA = charizardspeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + charizardspeedA);

        CheckBox charizardaverageCheckBox = (CheckBox) findViewById(R.id.charizardaverage_checkbox);
        boolean charizardaverageA = charizardaverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + charizardaverageA);

        CheckBox charizardtotalCheckBox = (CheckBox) findViewById(R.id.charizardtotal_checkbox);
        boolean charizardtotalA = charizardtotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + charizardtotalA);

        CheckBox charizardcatchrateCheckBox = (CheckBox) findViewById(R.id.charizardcatchrate_checkbox);
        boolean charizardcatchrateA = charizardcatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + charizardcatchrateA);

        CheckBox charizardlevelxpCheckBox = (CheckBox) findViewById(R.id.charizardlevelxp_checkbox);
        boolean charizardlevelxpA = charizardlevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + charizardlevelxpA);


        String charizarddataMessage = charizardinformation(charizardnummberA, charizardtypeA, charizardcategoryA,
                charizardheightA, charizardweightA, charizardabilityA, charizardhealthpointA, charizardattackA,
                charizarddefenseA, charizardspecialattackA, charizardspecialdefenseA, charizardspeedA, charizardaverageA,
                charizardtotalA, charizardcatchrateA, charizardlevelxpA);
        displayMessage0006(charizarddataMessage);

    }

    private String charizardinformation(boolean charizardbnumber, boolean charizardbtype, boolean charizardbcategory, boolean charizardbheight,
                                        boolean charizardbweight, boolean charizardbability, boolean charizardbhealthpoint, boolean charizardbattack,
                                        boolean charizardbdefense, boolean charizardbspecialattack, boolean charizardbspecialdefense,
                                        boolean charizardbspeed, boolean charizardbaverage, boolean charizardbtotal, boolean charizardbcatchrate,
                                        boolean charizardblevelxp)
    {
        String charizarddataMessage = "정보: \n\n";
        if(charizardbnumber)
            charizarddataMessage += "\n도감번호: " + charizardnumber;
        if(charizardbtype)
            charizarddataMessage += "\n타입: " + charizardtype;
        if(charizardbcategory)
            charizarddataMessage += "\n분류: " + charizardcategory;
        if(charizardbheight)
            charizarddataMessage += "\n키(m): " + charizardheight;
        if(charizardbweight)
            charizarddataMessage += "\n몸무게(kg): " + charizardweight;
        if(charizardbability)
            charizarddataMessage += "\n특성: " + charizardability;
        if(charizardbhealthpoint)
            charizarddataMessage += "\n\nHP: " + charizardhealthpoint;
        if(charizardbattack)
            charizarddataMessage += "\n공격: " + charizardattack;
        if(charizardbdefense)
            charizarddataMessage += "\n방어: " + charizarddefense;
        if(charizardbspecialattack)
            charizarddataMessage += "\n특공: " + charizardspecialattack;
        if(charizardbspecialdefense)
            charizarddataMessage += "\n특방: " + charizardspecialdefense;
        if(charizardbspeed)
            charizarddataMessage += "\n스피드: " + charizardspeed;
        if(charizardbaverage)
            charizarddataMessage += "\n평균: " + charizardaverage;
        if(charizardbtotal)
            charizarddataMessage += "\n종합값: " + charizardtotal;
        if(charizardbcatchrate)
            charizarddataMessage += "\n포획률: " + charizardcatchrate;
        if(charizardblevelxp)
            charizarddataMessage += "\nLv 100 경험치량: " + charizardlevelxp;

        return charizarddataMessage;
    }

    private void displayMessage0006(String message) {
        TextView charizardTextView = (TextView) findViewById(R.id.charizardinfo);
        charizardTextView.setText(message);
    }

}

