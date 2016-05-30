package com.media.notemedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        TextView text2 = new TextView(this);
        text.setText(R.string.app_name);
        setContentView(text);

        String texte = getResources().getString(R.string.app_name);
        String textFinal = texte.replace("Media", "Film");
        text2.setText(textFinal);
        setContentView(text2);

        // super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
    }
}