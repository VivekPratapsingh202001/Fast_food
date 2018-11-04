package com111.example.vivekpratapssingh.fast_food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5;
    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.chowmine);
        c2=(CheckBox)findViewById(R.id.Pizza);
        c3=(CheckBox)findViewById(R.id.hotdog);
        c4=(CheckBox)findViewById(R.id.manchurian);
        c5=(CheckBox)findViewById(R.id.Pasta);

    }

    public void order(View View){
        Toast.makeText(getApplicationContext(),"Your Order is plased/n Total price is :"+sum,Toast.LENGTH_LONG).show();
        sum=0;
    }

    public void chowmin(View view) { sum=sum+70; }


    public void Pizza(View view) { sum=sum+110; }


    public void Hotdog(View view) { sum=sum+50; }


    public void manchurian(View view) { sum=sum+90; }


    public void Pasta(View view) { sum=sum+100; }
}
