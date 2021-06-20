package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainview, view2;
    double num1, num2, result;
    String operator;
    boolean count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainview = findViewById(R.id.maintext);
        view2 = findViewById(R.id.text2);
    }

    public void calculation(View view) {

        if(view.getId() == R.id.btn0){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("0");
            }
            else{
                mainview.setText(prevalue + "0");
            }
        }
        else if(view.getId() == R.id.btn1){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("1");
            }
            else{
                mainview.setText(prevalue + "1");
            }
        }
        else if(view.getId() == R.id.btn2){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("2");
            }
            else{
                mainview.setText(prevalue + "2");
            }
        }
        else if(view.getId() == R.id.btn3){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("3");
            }
            else{
                mainview.setText(prevalue + "3");
            }
        }
        else if(view.getId() == R.id.btn4){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("4");
            }
            else{
                mainview.setText(prevalue + "4");
            }
        }
        else if(view.getId() == R.id.btn5){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("5");
            }
            else{
                mainview.setText(prevalue + "5");
            }
        }
        else if(view.getId() == R.id.btn6){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("6");
            }
            else{
                mainview.setText(prevalue + "6");
            }
        }
        else if(view.getId() == R.id.btn7){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("7");
            }
            else{
                mainview.setText(prevalue + "7");
            }
        }
        else if(view.getId() == R.id.btn8){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("8");
            }
            else{
                mainview.setText(prevalue + "8");
            }
        }
        else if(view.getId() == R.id.btn9){
            String prevalue = mainview.getText().toString();
            if(prevalue.equals("0")) {
                mainview.setText("9");
            }
            else{
                mainview.setText(prevalue + "9");
            }
        }

        else if(view.getId() == R.id.sum){
            String text2 = mainview.getText().toString();
            view2.setText(text2 + " " + " " + "+" + " ");

            num1 = Double.parseDouble(text2);
            operator = "+";
            mainview.setText("0");
            count = false;
        }
        else if(view.getId() == R.id.sub){
            String text2 = mainview.getText().toString();
            view2.setText(text2 + " " + " " + "-" + " ");

            num1 = Double.parseDouble(text2);
            operator = "-";
            mainview.setText("0");
            count = false;
        }
        else if(view.getId() == R.id.mul){
            String text2 = mainview.getText().toString();
            view2.setText(text2 + " " + " " + "*" + " ");

            num1 = Double.parseDouble(text2);
            operator = "*";
            mainview.setText("0");
            count = false;
        }
        else if(view.getId() == R.id.div){
            String text2 = mainview.getText().toString();
            view2.setText(text2 + " " + " " + "/" + " ");

            num1 = Double.parseDouble(text2);
            operator = "/";
            mainview.setText("0");
            count = false;
        }

        else if(view.getId() == R.id.ans){
            String text2 = mainview.getText().toString();
            num2 = Double.parseDouble(text2);

            if(operator.equals("+")) {
                result = num1 + num2;
            }
            else if(operator.equals("-")) {
                result = num1 - num2;
            }
            else if(operator.equals("*")) {
                result = num1 * num2;
            }
            else{
                result = num1 / num2;
            }

            view2.setText("" + num1+" " + " " + operator + " " + num2 + " = " + result);
            mainview.setText(""+result);
        }

        else if(view.getId() == R.id.c){
            view2.setText("");
            mainview.setText("0");
            operator = "";
            count = false;
        }

        else if(view.getId() == R.id.ce){
            mainview.setText("0");
            count = false;
        }

        else if(view.getId() == R.id.dot){
            if(count == false) {
                count = true;
                String prevalue = mainview.getText().toString();
                if (prevalue.equals("0")) {
                    mainview.setText(".");
                }
                else {
                    mainview.setText(prevalue + ".");
                }
            }
        }

        else if(view.getId() == R.id.delete){
            String text2 = mainview.getText().toString();
            if(text2.length() > 1){
                char lastChar = text2.charAt(text2.length()-1);
                if(lastChar == '.'){
                    count = false;
                }
                text2 = text2.substring(0, text2.length()-1);
                mainview.setText(text2);
            }
            else{
                mainview.setText("0");
                count = false;
            }
        }

        else if(view.getId() == R.id.sumsub){
            String text2 = mainview.getText().toString();
            double temp_text2 = Double.parseDouble(text2);
            if(temp_text2 < 0){
                text2 = "+" + text2;
            }
            else if(temp_text2 > 0){
                text2 = "-" + text2;
            }
            mainview.setText(text2);
        }

    }

}