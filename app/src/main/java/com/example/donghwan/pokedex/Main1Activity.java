package com.example.donghwan.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.content.Intent;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    String bulbasaurnumber = "0001";
    String bulbasaurtype = "풀 / 독";
    String bulbasaurcategory = "씨앗포켓몬";
    double bulbasaurheight = 0.7;
    double bulbasaurweight = 6.9;
    String bulbasaurability = "심록";
    int bulbasaurhealthpoint = 45;
    int bulbasaurattack = 49;
    int bulbasaurdefense = 49;
    int bulbasaurspecialattack = 65;
    int bulbasaurspecialdefense = 65;
    int bulbasaurspeed = 45;
    double bulbasauraverage = 53.00;
    int bulbasaurtotal = 318;
    int bulbasaurcatchrate = 45;
    int bulbasaurlevelxp = 1059860;

    public void showbulbasaur(View view) {
        CheckBox bulbasaurnumberCheckBox = (CheckBox) findViewById(R.id.bulbasaurnum_checkbox);
        boolean bulbasaurnummberA = bulbasaurnumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + bulbasaurnummberA);

        CheckBox bulbasaurtypeCheckBox = (CheckBox) findViewById(R.id.bulbasaurtype_checkbox);
        boolean bulbasaurtypeA = bulbasaurtypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + bulbasaurtypeA);

        CheckBox bulbasaurcategoryCheckBox = (CheckBox) findViewById(R.id.bulbasaurcategory_checkbox);
        boolean bulbasaurcategoryA = bulbasaurcategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + bulbasaurcategoryA);

        CheckBox bulbasaurheightCheckBox = (CheckBox) findViewById(R.id.bulbasaurheight_checkbox);
        boolean bulbasaurheightA = bulbasaurheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + bulbasaurheightA);

        CheckBox bulbasaurweightCheckBox = (CheckBox) findViewById(R.id.bulbasaurweight_checkbox);
        boolean bulbasaurweightA = bulbasaurweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + bulbasaurweightA);

        CheckBox bulbasaurabilityCheckBox = (CheckBox) findViewById(R.id.bulbasaurability_checkbox);
        boolean bulbasaurabilityA = bulbasaurabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + bulbasaurabilityA);

        CheckBox bulbasaurhealthpointCheckBox = (CheckBox) findViewById(R.id.bulbasaurhealthpoint_checkbox);
        boolean bulbasaurhealthpointA = bulbasaurhealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + bulbasaurhealthpointA);

        CheckBox bulbasaurattackCheckBox = (CheckBox) findViewById(R.id.bulbasaurattack_checkbox);
        boolean bulbasaurattackA = bulbasaurattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + bulbasaurattackA);

        CheckBox bulbasaurdefenseCheckBox = (CheckBox) findViewById(R.id.bulbasaurdefense_checkbox);
        boolean bulbasaurdefenseA = bulbasaurdefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + bulbasaurdefenseA);

        CheckBox bulbasaurspecialattackCheckBox = (CheckBox) findViewById(R.id.bulbasaurspecialattack_checkbox);
        boolean bulbasaurspecialattackA = bulbasaurspecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + bulbasaurspecialattackA);

        CheckBox bulbasaurspecialdefenseCheckBox = (CheckBox) findViewById(R.id.bulbasaurspecialdefense_checkbox);
        boolean bulbasaurspecialdefenseA = bulbasaurspecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + bulbasaurspecialdefenseA);

        CheckBox bulbasaurspeedCheckBox = (CheckBox) findViewById(R.id.bulbasaurspeed_checkbox);
        boolean bulbasaurspeedA = bulbasaurspeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + bulbasaurspeedA);

        CheckBox bulbasauraverageCheckBox = (CheckBox) findViewById(R.id.bulbasauraverage_checkbox);
        boolean bulbasauraverageA = bulbasauraverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + bulbasauraverageA);

        CheckBox bulbasaurtotalCheckBox = (CheckBox) findViewById(R.id.bulbasaurtotal_checkbox);
        boolean bulbasaurtotalA = bulbasaurtotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + bulbasaurtotalA);

        CheckBox bulbasaurcatchrateCheckBox = (CheckBox) findViewById(R.id.bulbasaurcatchrate_checkbox);
        boolean bulbasaurcatchrateA = bulbasaurcatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + bulbasaurcatchrateA);

        CheckBox bulbasaurlevelxpCheckBox = (CheckBox) findViewById(R.id.bulbasaurlevelxp_checkbox);
        boolean bulbasaurlevelxpA = bulbasaurlevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + bulbasaurlevelxpA);


        String bulbasaurdataMessage = bulbasaurinformation(bulbasaurnummberA, bulbasaurtypeA, bulbasaurcategoryA,
                bulbasaurheightA, bulbasaurweightA, bulbasaurabilityA, bulbasaurhealthpointA, bulbasaurattackA,
                bulbasaurdefenseA, bulbasaurspecialattackA, bulbasaurspecialdefenseA, bulbasaurspeedA, bulbasauraverageA,
                bulbasaurtotalA, bulbasaurcatchrateA, bulbasaurlevelxpA);
        displayMessage0001(bulbasaurdataMessage);

    }

    private String bulbasaurinformation(boolean bulbasaurbnumber, boolean bulbasaurbtype, boolean bulbasaurbcategory, boolean bulbasaurbheight,
                                        boolean bulbasaurbweight, boolean bulbasaurbability, boolean bulbasaurbhealthpoint, boolean bulbasaurbattack,
                                        boolean bulbasaurbdefense, boolean bulbasaurbspecialattack, boolean bulbasaurbspecialdefense,
                                        boolean bulbasaurbspeed, boolean bulbasaurbaverage, boolean bulbasaurbtotal, boolean bulbasaurbcatchrate,
                                        boolean bulbasaurblevelxp)
    {
        String bulbasaurdataMessage = "정보: \n\n";
        if(bulbasaurbnumber)
            bulbasaurdataMessage += "\n도감번호: " + bulbasaurnumber;
        if(bulbasaurbtype)
            bulbasaurdataMessage += "\n타입: " + bulbasaurtype;
        if(bulbasaurbcategory)
            bulbasaurdataMessage += "\n분류: " + bulbasaurcategory;
        if(bulbasaurbheight)
            bulbasaurdataMessage += "\n키(m): " + bulbasaurheight;
        if(bulbasaurbweight)
            bulbasaurdataMessage += "\n몸무게(kg): " + bulbasaurweight;
        if(bulbasaurbability)
            bulbasaurdataMessage += "\n특성: " + bulbasaurability;
        if(bulbasaurbhealthpoint)
            bulbasaurdataMessage += "\n\nHP: " + bulbasaurhealthpoint;
        if(bulbasaurbattack)
            bulbasaurdataMessage += "\n공격: " + bulbasaurattack;
        if(bulbasaurbdefense)
            bulbasaurdataMessage += "\n방어: " + bulbasaurdefense;
        if(bulbasaurbspecialattack)
            bulbasaurdataMessage += "\n특공: " + bulbasaurspecialattack;
        if(bulbasaurbspecialdefense)
            bulbasaurdataMessage += "\n특방: " + bulbasaurspecialdefense;
        if(bulbasaurbspeed)
            bulbasaurdataMessage += "\n스피드: " + bulbasaurspeed;
        if(bulbasaurbaverage)
            bulbasaurdataMessage += "\n평균: " + bulbasauraverage;
        if(bulbasaurbtotal)
            bulbasaurdataMessage += "\n종합값: " + bulbasaurtotal;
        if(bulbasaurbcatchrate)
            bulbasaurdataMessage += "\n포획률: " + bulbasaurcatchrate;
        if(bulbasaurblevelxp)
            bulbasaurdataMessage += "\nLv 100 경험치량: " + bulbasaurlevelxp;

        return bulbasaurdataMessage;
    }

    private void displayMessage0001(String message) {
        TextView BulbasaurTextView = (TextView) findViewById(R.id.bulbasaurinfo);
        BulbasaurTextView.setText(message);
    }

}
