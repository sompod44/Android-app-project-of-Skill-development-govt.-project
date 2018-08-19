package com.sompod44soft.assignment_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Successful_registration extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_registration);

        textView = findViewById(R.id.registrationusertextviewID);
        String s;
        try {
            s = registration.sharedPreferences.getString("UN","nulluser");
            textView.setText("Hi Dear "+s+",\nNow your are registered user of this app\nThank you for registration here.");
        }catch (Exception e){

        }
    }
}
