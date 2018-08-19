package com.sompod44soft.assignment_04;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener{
private Button button;
private EditText editText1,editText2;
public String s,s1;
public int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.loginbuttonID);
        editText1 = findViewById(R.id.usernameID);
        editText2 = findViewById(R.id.passwordID);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.loginbuttonID){
            if(editText1.getText().toString().equals("") || editText2.getText().toString().equals("")){
                Toast.makeText(this, "Plz fill all the fields.", Toast.LENGTH_SHORT).show();
            }
            else{
                try {
                    s = registration.sharedPreferences.getString("UN","nulluser").toString();
                    s1 = registration.sharedPreferences1.getString("pass","nullpass").toString();
                    if(editText1.getText().toString().equals(s) && editText2.getText().toString().equals(s1)){
                        Toast.makeText(this, "Successfully login.", Toast.LENGTH_SHORT).show();
                        editText1.setText("");
                        editText2.setText("");
                        Intent intent = new Intent(this,LoginEnterface.class);
                        startActivity(intent);
                    }
                }catch (Exception e){
                    Toast.makeText(this, "First complete your registration.", Toast.LENGTH_SHORT).show();
                }
            }

        }
    }
}
