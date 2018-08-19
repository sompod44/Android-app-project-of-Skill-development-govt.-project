package com.sompod44soft.assignment_04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginEnterface extends AppCompatActivity implements View.OnClickListener{
private TextView textView;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_enterface);

        textView = findViewById(R.id.logintextviewID);
        button = findViewById(R.id.logoutbuttonID);
        String s;
        try {
            s = registration.sharedPreferences.getString("UN","nulluser");
            textView.setText("Hi "+s+" \n Successfully Login.");
        }catch (Exception e){

        }

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.logoutbuttonID){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}
