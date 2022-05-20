
package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText enternumber;
    Button getotpbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enternumber = findViewById(R.id.input_number);
        getotpbutton = findViewById(R.id.button_otp);


           getotpbutton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(!enternumber.getText().toString().trim().isEmpty()){
                       if((enternumber.getText().toString().trim()).length() == 10) {
                           Intent intent = new Intent(getApplicationContext(), verifyotp.class);
                           intent.putExtra("mobile", enternumber.getText().toString());
                           startActivity(intent);
                       }else{
                           Toast.makeText(MainActivity.this,"Please enter correct number",Toast.LENGTH_SHORT).show();
                       }
                   }else{
                       Toast.makeText(MainActivity.this,"Enter Mobile number",Toast.LENGTH_SHORT).show();
                   }
               }
        });
    }
}