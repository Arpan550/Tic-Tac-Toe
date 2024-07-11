package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bcur;
    String bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9;
    int flag=0;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
    }
    public void check(View view){
        bcur =(Button) view;
        if(bcur.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                bcur.setText("X");
                flag = 1;
            } else {
                bcur.setText("O");
                flag = 0;
            }

            if (count > 4) {
                bb1 = b1.getText().toString();
                bb2 = b2.getText().toString();
                bb3 = b3.getText().toString();
                bb4 = b4.getText().toString();
                bb5 = b5.getText().toString();
                bb6 = b6.getText().toString();
                bb7 = b7.getText().toString();
                bb8 = b8.getText().toString();
                bb9 = b9.getText().toString();

                if (bb1.equals(bb2) && bb2.equals(bb3) && !bb1.equals("")) {
                    Toast.makeText(this, "Winner:: " + bb1, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (bb4.equals(bb5) && bb5.equals(bb6) && !bb4.equals("")) {
                    Toast.makeText(this, "Winner:: " + bb4, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (bb7.equals(bb8) && bb8.equals(bb9) && !bb7.equals("")) {
                    Toast.makeText(this, "Winner:: " + bb7, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (bb1.equals(bb4) && bb4.equals(bb7) && !bb1.equals("")) {
                    Toast.makeText(this, "Winner:: " + bb1, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (bb2.equals(bb5) && bb5.equals(bb8) && !bb2.equals("")) {
                    Toast.makeText(this, "Winner:: " + bb2, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (bb3.equals(bb6) && bb6.equals(bb9) && !bb3.equals("")) {
                    Toast.makeText(this, "Winner:: " + bb3, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (bb1.equals(bb5) && bb5.equals(bb9) && !bb1.equals("")) {
                    Toast.makeText(this, "Winner:: " + bb1, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (bb3.equals(bb5) && bb5.equals(bb7) && !bb3.equals("")) {
                    Toast.makeText(this, "Winner:: " + bb3, Toast.LENGTH_SHORT).show();
                    newgame();
                } else if (!bb1.equals("") && !bb2.equals("") && !bb3.equals("") && !bb4.equals("") && !bb5.equals("") && !bb6.equals("") && !bb7.equals("") && !bb8.equals("") && !bb9.equals("")) {
                    Toast.makeText(this, "Match is Draw!!", Toast.LENGTH_SHORT).show();
                    newgame();
                }
            }
        }
    }



    public void newgame(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        count=0;
        flag=0;
    }

}