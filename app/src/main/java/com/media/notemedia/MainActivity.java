package com.media.notemedia;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Validate button
    private Button buttonValidate = null;
    //Explain text
    private TextView textExplain = null;
    //True box
    private CheckBox boxTrue = null;
    //False box
    private CheckBox boxFalse = null;
    //Choice group
    private RadioGroup choices = null;
    //Response text
    private TextView response = null;
    //Edit text
    private EditText question = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

        //Initialize elements
        buttonValidate = (Button)findViewById(R.id.boutonTest);
        buttonValidate.setText("Valider");

        textExplain = (TextView)findViewById(R.id.app_name);
        textExplain.setText("Faites parler les gens !");

        boxTrue = (CheckBox)findViewById(R.id.checkBox);
        boxFalse = (CheckBox)findViewById(R.id.checkBox2);
        boxTrue.setText("Vrai");
        boxFalse.setText("Faux");
        boxTrue.setChecked(true);

        choices = (RadioGroup)findViewById(R.id.radioGroup);
        RadioButton radio1 = (RadioButton)findViewById(R.id.radio1);
        RadioButton radio2 = (RadioButton)findViewById(R.id.radio2);
        RadioButton radio3 = (RadioButton)findViewById(R.id.radio3);
        radio1.setText("Hollande");
        radio2.setText("Sherlock");
        radio3.setText("Chuck Norris");

        question = (EditText)findViewById(R.id.editText);

        response = (TextView)findViewById(R.id.resText);

        //Action on validate button
        buttonValidate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(question.getText().toString().isEmpty()){
            Toast toast = Toast.makeText(MainActivity.this, "Vous ne pouvez pas ne rien dire voyons !", Toast.LENGTH_LONG);
            toast.show();
            response.setText("");
        } else {
            RadioButton choice = (RadioButton) findViewById(choices.getCheckedRadioButtonId());
            if(choices.getCheckedRadioButtonId() == -1){
                Toast toast = Toast.makeText(MainActivity.this, "Comment voulez-vous faire parler personne ?", Toast.LENGTH_LONG);
                toast.show();
                response.setText("");
            } else {
                if(boxTrue.isChecked() && boxFalse.isChecked()){
                    Toast toast = Toast.makeText(MainActivity.this, "Dire quelques chose de Vrai et de Faux n'est pas possible voyons !", Toast.LENGTH_LONG);
                    toast.show();
                    response.setText("");
                } else {
                    if (boxTrue.isChecked()) {
                        response.setText("Quand " + choice.getText().toString() + " disait '" + question.getText().toString() + "'. Il avait raison !");
                    } else {
                        response.setText("Quand " + choice.getText().toString() + " disait '" + question.getText().toString() + "'. Il avait tort !");
                    }
                }
            }
        }
    }
}