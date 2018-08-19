package com.sompod44soft.assignment_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Format;
import java.util.Formatter;

public class Calculator extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
            b11, b12, b13, b14, b15, b16, b17, b18, b19,
            b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
    TextView textView;
    StringBuilder stringBuilder = new StringBuilder();
    int opa = 0,otherbutton = 0,result = 1;
    double mainresult = 0;
    boolean checkbuttonX = false,checkbuttonY = false,checkbuttonZ = false,checkbuttonXX = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        // b1 to b10 button for 0 - 9
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.bzero);

        b11 = findViewById(R.id.bmul);
        b12 = findViewById(R.id.bdev);
        b13 = findViewById(R.id.bplus);
        b14 = findViewById(R.id.bminus);
        b15 = findViewById(R.id.bequal);
        b16 = findViewById(R.id.del);
        b17 = findViewById(R.id.cle);

        b18 = findViewById(R.id.bdot);
        b19 = findViewById(R.id.firstbracket);
        b20 = findViewById(R.id.secondbraket);
        b21 = findViewById(R.id.bpower);
        b22 = findViewById(R.id.bmod);
        b23 = findViewById(R.id.bpersent);
        b24 = findViewById(R.id.bsqrt);
        b25 = findViewById(R.id.bsin);
        b25 = findViewById(R.id.bcos);
        b25 = findViewById(R.id.btan);
        b25 = findViewById(R.id.bcot);

        textView = findViewById(R.id.textviewID1);


    }

    public void numberbutton(View view) { // this method for number button

        if (view.getId() == R.id.b1) {
            stringBuilder.append(b1.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }



        }
        if (view.getId() == R.id.b2) {
            stringBuilder.append(b2.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }
        }
        if (view.getId() == R.id.b3) {
            stringBuilder.append(b3.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }
        }
        if (view.getId() == R.id.b4) {
            stringBuilder.append(b4.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }
        }
        if (view.getId() == R.id.b5) {
            stringBuilder.append(b5.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }
        }
        if (view.getId() == R.id.b6) {
            stringBuilder.append(b6.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }
        }
        if (view.getId() == R.id.b7) {
            stringBuilder.append(b7.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }
        }
        if (view.getId() == R.id.b8) {
            stringBuilder.append(b8.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }

        }
        if (view.getId() == R.id.b9) {
            stringBuilder.append(b9.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }

        }
        if (view.getId() == R.id.bzero) {
            stringBuilder.append(b10.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }

        }
        if (view.getId() == R.id.bdot) {
            stringBuilder.append(b18.getText());
            textView.setText(stringBuilder);
            if(opa == 1){
                checkbuttonX = true;

            }
            else if(opa == 2){
                checkbuttonY = true;
            }

            else if(opa == 3){
                checkbuttonZ = true;
            }
            else if(opa == 4){
                checkbuttonXX = true;
            }else{
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;
            }

        }
    }



    public void oparetorbutton(View view) { // this method for operator button
        if (view.getId() == R.id.bmul) {
            if (checkbuttonX) {
                stringBuilder.append("X");
                textView.setText(stringBuilder);
                opa = 1;
                checkbuttonX = false;
                checkbuttonY = false;
                checkbuttonZ = false;
                checkbuttonXX = false;
            }
        }
        else if (view.getId() == R.id.bdev) {
            if (checkbuttonY) {
                stringBuilder.append("/");
                textView.setText(stringBuilder);
                opa = 2;
                checkbuttonX = false;
                checkbuttonY = false;
                checkbuttonZ = false;
                checkbuttonXX = false;
            }
        }
        else if (view.getId() == R.id.bplus) {
            if (checkbuttonZ) {
                stringBuilder.append("+");
                textView.setText(stringBuilder);
                opa = 3;
                checkbuttonX = false;
                checkbuttonY = false;
                checkbuttonZ = false;
                checkbuttonXX = false;
            }
        }
        else if (view.getId() == R.id.bminus) {
            if (checkbuttonXX) {
                stringBuilder.append("-");
                textView.setText(stringBuilder);
                opa = 4;
                checkbuttonX = false;
                checkbuttonY = false;
                checkbuttonZ = false;
                checkbuttonXX = false;
            }
        }

        else if (view.getId() == R.id.bequal) { // this button produce result

            if(result == 2){
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append(mainresult);
                textView.setText(stringBuilder);
                --result;
                checkbuttonX = true;
                checkbuttonY = true;
                checkbuttonZ = true;
                checkbuttonXX = true;

                opa = 0;
            }
            else{
                ++result;
                if (opa == 1) {
                    try {
                        String str = stringBuilder.toString();
                        String[] ch = str.split("X");
                        float ans = 1;
                        for (String s : ch) {
                            float f = Float.parseFloat(s);
                            ans = ans * f;
                        }
                        stringBuilder.append("\n = " + ans);
                        mainresult = ans;
                        textView.setText(stringBuilder);
                    } catch (Exception e) {
                        Toast.makeText(this, "problem + ", Toast.LENGTH_SHORT).show();
                    }

                }

                else if (opa == 2) {
                    try {
                        String str = stringBuilder.toString();
                        String[] ch = str.split("/");
                        float ans = Float.parseFloat(ch[0]);
                        for(int i = 1;i<ch.length; i++){
                            float f = Float.parseFloat(ch[i]);
                            ans = ans / f;
                        }
                        stringBuilder.append("\n = "+ans);
                        mainresult = ans;
                        textView.setText(stringBuilder);
                    } catch (Exception e) {
                        Toast.makeText(this, "problem /", Toast.LENGTH_SHORT).show();
                    }

                }

                else if (opa == 3) {
                    try {
                        String str = stringBuilder.toString();
                        String[] ch = str.split("\\+");
                        float ans = 0;
                        for(String s : ch){
                            float f = Float.parseFloat(s);
                            ans = ans + f;
                        }
                        stringBuilder.append("\n = "+ans);
                        mainresult = ans;
                        textView.setText(stringBuilder);
                    } catch (Exception e) {
                        Toast.makeText(this, "problem + ", Toast.LENGTH_SHORT).show();
                    }

                }
                else if (opa == 4) {
                    try {
                        String str = stringBuilder.toString();
                        char[] c = str.toCharArray();
                        float ans;
                        String[] ch = str.split("-");
                        if(c[0]=='-'){
                            ans = - Float.parseFloat(ch[1]);
                            for(int i = 2;i<ch.length; i++){
                                float f = Float.parseFloat(ch[i]);
                                ans = ans - f;
                            }
                        }else{
                            ans = Float.parseFloat(ch[0]);
                            for(int i = 1;i<ch.length; i++){
                                float f = Float.parseFloat(ch[i]);
                                ans = ans - f;
                            }
                        }
                        stringBuilder.append("\n = "+ans);
                        mainresult = ans;
                        textView.setText(stringBuilder);
                    } catch (Exception e) {
                        Toast.makeText(this, "problem -", Toast.LENGTH_SHORT).show();
                    }

                }

                checkbuttonX = false;
                checkbuttonY = false;
                checkbuttonZ = false;
                checkbuttonXX = true;

                opa = 0;

                if(otherbutton == 1){
                    otherbutton = 0;
                    try {
                        String str = stringBuilder.toString();
                        double ans = 0;
                        String[] ch = str.split("\\^");
                        double f = Float.parseFloat(ch[0]);
                        double f1 = Float.parseFloat(ch[1]);
                        ans = Math.pow(f,f1);
                        stringBuilder.append("\n = "+ans);
                        mainresult = ans;
                        textView.setText(stringBuilder);
                    } catch (Exception e) {
                        Toast.makeText(this, "problem -", Toast.LENGTH_SHORT).show();
                    }

                }
                else if(otherbutton == 2){
                    otherbutton = 0;
                    try {
                        String str = stringBuilder.toString();
                        double ans = 0;
                        String[] ch = str.split(" MOD ");
                        double f = Float.parseFloat(ch[0]);
                        double f1 = Float.parseFloat(ch[1]);
                        ans = f%f1;
                        stringBuilder.append("\n = "+ans);
                        mainresult = ans;
                        textView.setText(stringBuilder);
                    } catch (Exception e) {
                        Toast.makeText(this, "problem -", Toast.LENGTH_SHORT).show();
                    }

                }
                else if(otherbutton == 3){
                    otherbutton = 0;
                    try {
                        String str = stringBuilder.toString();
                        double ans = 0;
                        String[] ch = str.split(" sqrt");
                        double f = Float.parseFloat(ch[0]);
                        ans = Math.sqrt(f);
                        stringBuilder.append("\n = "+ans);
                        mainresult = ans;
                        textView.setText(stringBuilder);
                    } catch (Exception e) {
                        Toast.makeText(this, "problem -", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        }
    }

    public void deleteclear(View view) { // this method for Delete and clear button
        if (view.getId() == R.id.del) {
            if (stringBuilder.length() > 0) {
                stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
                textView.setText(stringBuilder);
            }

        }
        if (view.getId() == R.id.cle) {
            stringBuilder.delete(0, stringBuilder.length());
            textView.setText(stringBuilder);
            checkbuttonX = false;
            checkbuttonY = false;
            checkbuttonZ = false;
            checkbuttonXX = true;
            result = 1;
            opa = 0;
        }
    }

    public void otherbutton(View view){
        if(view.getId() == R.id.firstbracket){
            Toast.makeText(this, "Next update!", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.secondbraket){
            Toast.makeText(this, "Next update!", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.bpower){
            stringBuilder.append("^");
            textView.setText(stringBuilder);
            otherbutton = 1;
        }
        else if(view.getId() == R.id.bmod){
            stringBuilder.append(" MOD ");
            textView.setText(stringBuilder);
            otherbutton = 2;
        }
        else if(view.getId() == R.id.bpersent){
            Toast.makeText(this, "Next update!", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.bsqrt){
            stringBuilder.append(" sqrt");
            textView.setText(stringBuilder);
            otherbutton = 3;
        }
        else if(view.getId() == R.id.bsin){
            try{
                Double d = Double.parseDouble(textView.getText().toString());
                stringBuilder.delete(0,stringBuilder.length());
                Double d1 = Math.sin(d);
                String s = d1.toString();
                stringBuilder.append("sin ( "+d+" )\n"+" = "+s);
                textView.setText(stringBuilder);
                ++result;
                mainresult = Math.sin(d);
            }catch(Exception e){

            }


        }
        else if(view.getId() == R.id.bcos){
            try{
                Double d = Double.parseDouble(textView.getText().toString());
                stringBuilder.delete(0,stringBuilder.length());
                Double d1 = Math.cos(d);
                String s = d1.toString();
                stringBuilder.append("cos ( "+d+" )\n"+" = "+s);
                textView.setText(stringBuilder);
                ++result;
                mainresult = Math.sin(d);
            }catch(Exception e){

            }
        }
        else if(view.getId() == R.id.btan){
            try{
                Double d = Double.parseDouble(textView.getText().toString());
                stringBuilder.delete(0,stringBuilder.length());
                Double d1 = Math.tan(d);
                String s = d1.toString();
                stringBuilder.append("tan ( "+d+" )\n"+" = "+s);
                textView.setText(stringBuilder);
                ++result;
                mainresult = Math.sin(d);
            }catch(Exception e){

            }
        }
        else if(view.getId() == R.id.bcot){
            try{
                Double d = Double.parseDouble(textView.getText().toString());
                stringBuilder.delete(0,stringBuilder.length());
                Double d1 = 1/(Math.tan(d));
                String s = d1.toString();
                stringBuilder.append("cot ( "+d+" )\n"+" = "+s);
                textView.setText(stringBuilder);
                ++result;
                mainresult = Math.sin(d);
            }catch(Exception e){

            }
        }
    }

}
