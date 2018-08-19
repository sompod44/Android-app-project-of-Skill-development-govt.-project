package com.sompod44soft.assignment_04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ImageView imageView;
private Button button,button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button2);
        button2 = (Button) findViewById(R.id.button3);
        button3 = (Button) findViewById(R.id.button4);
    }
    public void ImageListener(View view){
        if(view.getId()==R.id.imageView){
            Toast.makeText(this, "Hello! I am sompod. What's up?", Toast.LENGTH_LONG).show();
        }
    }
    public void ButtonListener(View view){
        if(view.getId() == R.id.button){
            Intent intent = new Intent(this,AboutMe.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button2){
            Intent intent = new Intent(this,registration.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button3){
            Intent intent = new Intent(this,Login.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button4){
            Intent intent = new Intent(this,Calculator.class);
            startActivity(intent);
        }
    }
}
