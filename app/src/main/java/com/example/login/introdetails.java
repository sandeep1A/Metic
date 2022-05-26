package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class introdetails extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introdetails);
        radioGroup = findViewById(R.id.radiogroup1);
        final EditText text = (EditText) findViewById(R.id.edittext2);
        final EditText text1 = (EditText) findViewById(R.id.edittext3);
        Button button = (Button) findViewById(R.id.button_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(introdetails.this, mainpage.class);
                String msg = text.getText().toString();
                String msg1 = text1.getText().toString();
                intent.putExtra("EXTRA MSG", msg + "" + msg1);
                startActivity(intent);
            }
        });
    }
        public void checkButton(View v) {
            int radioId = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(radioId);
            Toast.makeText(this, "selected"+radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}