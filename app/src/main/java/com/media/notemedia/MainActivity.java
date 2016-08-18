package com.media.notemedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        TextView text = new TextView(this);
//        TextView text2 = new TextView(this);
//        text.setText(R.string.app_name);
//        setContentView(text);
//
//        String texte = getResources().getString(R.string.app_name);
//        String textFinal = texte.replace("Media", "Film");
//        text2.setText(textFinal);
//        setContentView(text2);

         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

        //Texte central
        TextView texte = (TextView)findViewById(R.id.app_name);
        texte.setText("Mon premier champ texte");

        //Bouton haut
        Button bouton = (Button)findViewById(R.id.boutonTest);
        bouton.setText("Valider");

        //CheckBoxs
        CheckBox box1 = (CheckBox)findViewById(R.id.checkBox);
        CheckBox box2 = (CheckBox)findViewById(R.id.checkBox2);
        box1.setText("Vrai");
        box2.setText("Faux");
        box1.setChecked(true);

        //Radio bouton
        RadioButton radio1 = (RadioButton)findViewById(R.id.radio1);
        RadioButton radio2 = (RadioButton)findViewById(R.id.radio2);
        RadioButton radio3 = (RadioButton)findViewById(R.id.radio3);
        radio1.setText("Choix 1");
        radio2.setText("Choix 2");
        radio3.setText("Choix 3");
        radio3.setChecked(true);

    }
}