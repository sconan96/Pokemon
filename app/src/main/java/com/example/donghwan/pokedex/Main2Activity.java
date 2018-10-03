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


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button tomain02 = (Button) findViewById(R.id.ivysaurbackbt);
        tomain02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    String ivysaurnumber = "0002";
    String ivysaurtype = "풀 / 독";
    String ivysaurcategory = "씨앗포켓몬";
    double ivysaurheight = 1.0;
    double ivysaurweight = 13.0;
    String ivysaurability = "심록";
    int ivysaurhealthpoint = 60;
    int ivysaurattack = 62;
    int ivysaurdefense = 63;
    int ivysaurspecialattack = 80;
    int ivysaurspecialdefense = 80;
    int ivysaurspeed = 60;
    double ivysauraverage = 67.50;
    int ivysaurtotal = 405;
    int ivysaurcatchrate = 45;
    int ivysaurlevelxp = 1059860;

    public void showivysaur(View view) {
        CheckBox ivysaurnumberCheckBox = (CheckBox) findViewById(R.id.ivysaurnum_checkbox);
        boolean ivysaurnummberA = ivysaurnumberCheckBox.isChecked();
        Log.v("MainActivity", "도감번호: " + ivysaurnummberA);

        CheckBox ivysaurtypeCheckBox = (CheckBox) findViewById(R.id.ivysaurtype_checkbox);
        boolean ivysaurtypeA = ivysaurtypeCheckBox.isChecked();
        Log.v("MainActivity", "타입: " + ivysaurtypeA);

        CheckBox ivysaurcategoryCheckBox = (CheckBox) findViewById(R.id.ivysaurcategory_checkbox);
        boolean ivysaurcategoryA = ivysaurcategoryCheckBox.isChecked();
        Log.v("MainActivity", "분류: " + ivysaurcategoryA);

        CheckBox ivysaurheightCheckBox = (CheckBox) findViewById(R.id.ivysaurheight_checkbox);
        boolean ivysaurheightA = ivysaurheightCheckBox.isChecked();
        Log.v("MainActivity", "키: " + ivysaurheightA);

        CheckBox ivysaurweightCheckBox = (CheckBox) findViewById(R.id.ivysaurweight_checkbox);
        boolean ivysaurweightA = ivysaurweightCheckBox.isChecked();
        Log.v("MainActivity", "몸무게: " + ivysaurweightA);

        CheckBox ivysaurabilityCheckBox = (CheckBox) findViewById(R.id.ivysaurability_checkbox);
        boolean ivysaurabilityA = ivysaurabilityCheckBox.isChecked();
        Log.v("MainActivity", "특성: " + ivysaurabilityA);

        CheckBox ivysaurhealthpointCheckBox = (CheckBox) findViewById(R.id.ivysaurhealthpoint_checkbox);
        boolean ivysaurhealthpointA = ivysaurhealthpointCheckBox.isChecked();
        Log.v("MainActivity", "HP: " + ivysaurhealthpointA);

        CheckBox ivysaurattackCheckBox = (CheckBox) findViewById(R.id.ivysaurattack_checkbox);
        boolean ivysaurattackA = ivysaurattackCheckBox.isChecked();
        Log.v("MainActivity", "공격: " + ivysaurattackA);

        CheckBox ivysaurdefenseCheckBox = (CheckBox) findViewById(R.id.ivysaurdefense_checkbox);
        boolean ivysaurdefenseA = ivysaurdefenseCheckBox.isChecked();
        Log.v("MainActivity", "방어: " + ivysaurdefenseA);

        CheckBox ivysaurspecialattackCheckBox = (CheckBox) findViewById(R.id.ivysaurspecialattack_checkbox);
        boolean ivysaurspecialattackA = ivysaurspecialattackCheckBox.isChecked();
        Log.v("MainActivity", "특공: " + ivysaurspecialattackA);

        CheckBox ivysaurspecialdefenseCheckBox = (CheckBox) findViewById(R.id.ivysaurspecialdefense_checkbox);
        boolean ivysaurspecialdefenseA = ivysaurspecialdefenseCheckBox.isChecked();
        Log.v("MainActivity", "특방: " + ivysaurspecialdefenseA);

        CheckBox ivysaurspeedCheckBox = (CheckBox) findViewById(R.id.ivysaurspeed_checkbox);
        boolean ivysaurspeedA = ivysaurspeedCheckBox.isChecked();
        Log.v("MainActivity", "스피드: " + ivysaurspeedA);

        CheckBox ivysauraverageCheckBox = (CheckBox) findViewById(R.id.ivysauraverage_checkbox);
        boolean ivysauraverageA = ivysauraverageCheckBox.isChecked();
        Log.v("MainActivity", "평균: " + ivysauraverageA);

        CheckBox ivysaurtotalCheckBox = (CheckBox) findViewById(R.id.ivysaurtotal_checkbox);
        boolean ivysaurtotalA = ivysaurtotalCheckBox.isChecked();
        Log.v("MainActivity", "종합값: " + ivysaurtotalA);

        CheckBox ivysaurcatchrateCheckBox = (CheckBox) findViewById(R.id.ivysaurcatchrate_checkbox);
        boolean ivysaurcatchrateA = ivysaurcatchrateCheckBox.isChecked();
        Log.v("MainActivity", "포획률: " + ivysaurcatchrateA);

        CheckBox ivysaurlevelxpCheckBox = (CheckBox) findViewById(R.id.ivysaurlevelxp_checkbox);
        boolean ivysaurlevelxpA = ivysaurlevelxpCheckBox.isChecked();
        Log.v("MainActivity", "Lv 100 경험치량: " + ivysaurlevelxpA);


        String ivysaurdataMessage = ivysaurinformation(ivysaurnummberA, ivysaurtypeA, ivysaurcategoryA,
                ivysaurheightA, ivysaurweightA, ivysaurabilityA, ivysaurhealthpointA, ivysaurattackA,
                ivysaurdefenseA, ivysaurspecialattackA, ivysaurspecialdefenseA, ivysaurspeedA, ivysauraverageA,
                ivysaurtotalA, ivysaurcatchrateA, ivysaurlevelxpA);
        displayMessage0002(ivysaurdataMessage);

    }

    private String ivysaurinformation(boolean ivysaurbnumber, boolean ivysaurbtype, boolean ivysaurbcategory, boolean ivysaurbheight,
                                      boolean ivysaurbweight, boolean ivysaurbability, boolean ivysaurbhealthpoint, boolean ivysaurbattack,
                                      boolean ivysaurbdefense, boolean ivysaurbspecialattack, boolean ivysaurbspecialdefense,
                                      boolean ivysaurbspeed, boolean ivysaurbaverage, boolean ivysaurbtotal, boolean ivysaurbcatchrate,
                                      boolean ivysaurblevelxp)
    {
        String ivysaurdataMessage = "정보: \n\n";
        if(ivysaurbnumber)
            ivysaurdataMessage += "\n도감번호: " + ivysaurnumber;
        if(ivysaurbtype)
            ivysaurdataMessage += "\n타입: " + ivysaurtype;
        if(ivysaurbcategory)
            ivysaurdataMessage += "\n분류: " + ivysaurcategory;
        if(ivysaurbheight)
            ivysaurdataMessage += "\n키(m): " + ivysaurheight;
        if(ivysaurbweight)
            ivysaurdataMessage += "\n몸무게(kg): " + ivysaurweight;
        if(ivysaurbability)
            ivysaurdataMessage += "\n특성: " + ivysaurability;
        if(ivysaurbhealthpoint)
            ivysaurdataMessage += "\n\nHP: " + ivysaurhealthpoint;
        if(ivysaurbattack)
            ivysaurdataMessage += "\n공격: " + ivysaurattack;
        if(ivysaurbdefense)
            ivysaurdataMessage += "\n방어: " + ivysaurdefense;
        if(ivysaurbspecialattack)
            ivysaurdataMessage += "\n특공: " + ivysaurspecialattack;
        if(ivysaurbspecialdefense)
            ivysaurdataMessage += "\n특방: " + ivysaurspecialdefense;
        if(ivysaurbspeed)
            ivysaurdataMessage += "\n스피드: " + ivysaurspeed;
        if(ivysaurbaverage)
            ivysaurdataMessage += "\n평균: " + ivysauraverage;
        if(ivysaurbtotal)
            ivysaurdataMessage += "\n종합값: " + ivysaurtotal;
        if(ivysaurbcatchrate)
            ivysaurdataMessage += "\n포획률: " + ivysaurcatchrate;
        if(ivysaurblevelxp)
            ivysaurdataMessage += "\nLv 100 경험치량: " + ivysaurlevelxp;

        return ivysaurdataMessage;
    }

    private void displayMessage0002(String message) {
        TextView ivysaurTextView = (TextView) findViewById(R.id.ivysaurinfo);
        ivysaurTextView.setText(message);
    }

}
