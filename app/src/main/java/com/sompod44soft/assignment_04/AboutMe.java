package com.sompod44soft.assignment_04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sompod44soft.assignment_04.MyCV.Contacts;
import com.sompod44soft.assignment_04.MyCV.Details;
import com.sompod44soft.assignment_04.MyCV.Education;
import com.sompod44soft.assignment_04.MyCV.Experience;
import com.sompod44soft.assignment_04.MyCV.Skill;

public class AboutMe extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        button1 = findViewById(R.id.ID1);
        button2 = findViewById(R.id.educationbuttonID);
        button3 = findViewById(R.id.skillbuttonID);
        button4 = findViewById(R.id.experiencebuttonID);
        button5 = findViewById(R.id.contactsbuttonID);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ID1) {
            Intent intent = new Intent(this, Details.class);
            startActivity(intent);
        } else if (v.getId() == R.id.educationbuttonID) {
            Intent intent = new Intent(this, Education.class);
            startActivity(intent);
        } else if (v.getId() == R.id.skillbuttonID) {
            Intent intent = new Intent(this, Skill.class);
            startActivity(intent);
        } else if (v.getId() == R.id.experiencebuttonID) {
            Intent intent = new Intent(this, Experience.class);
            startActivity(intent);
        } else if (v.getId() == R.id.contactsbuttonID) {
            Intent intent = new Intent(this, Contacts.class);
            startActivity(intent);
        }
    }
}
