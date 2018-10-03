package com.example.donghwan.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton tobulbasuar = (ImageButton) findViewById(R.id.Bulbasaur001);
        tobulbasuar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main1Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton toivysaur = (ImageButton) findViewById(R.id.Ivysaur002);
        toivysaur.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton tovenusaur = (ImageButton) findViewById(R.id.Venusaur003);
        tovenusaur.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main3Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton tocharmander = (ImageButton) findViewById(R.id.Charmander004);
        tocharmander.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main4Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton tocharmeleon = (ImageButton) findViewById(R.id.Charmeleon005);
        tocharmeleon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main5Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton tocharizard = (ImageButton) findViewById(R.id.Charizard006);
        tocharizard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main6Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton tosquirtle = (ImageButton) findViewById(R.id.Squirtle007);
        tosquirtle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main7Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton towartortle = (ImageButton) findViewById(R.id.Wartortle008);
        towartortle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main8Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton toblastoise = (ImageButton) findViewById(R.id.Blastoise009);
        toblastoise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main9Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton tocaterpie = (ImageButton) findViewById(R.id.Caterpie010);
        tocaterpie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main10Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton tometapod = (ImageButton) findViewById(R.id.Metapod011);
        tometapod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main11Activity.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton tobutterfree = (ImageButton) findViewById(R.id.Butterfree012);
        tobutterfree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main12Activity.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}
