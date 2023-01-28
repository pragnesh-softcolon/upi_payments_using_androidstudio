package com.example.upipay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btn;
    double total_price = 01.00;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btn=findViewById(R.id.button2);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    //this will be triggered when button is clicked
                    Intent myIntent = new Intent(MainActivity.this,upi.class);
                    //ADD the data into bundle and send
                    Bundle bundle = new Bundle();  //create a bundle and send it to activity called upi class.
                    bundle.putString("stuffs", Double.toString(total_price));
                    myIntent.putExtras(bundle);
                    startActivity(myIntent);      //for more details refer stackoverflow how to send data from one activity to other
                }
            });
        }
}