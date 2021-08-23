package com.neha.fititupdailyworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button button1, button2, button3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.start_before);
        button2 = findViewById(R.id.start_after);
        button3 = findViewById(R.id.start_hard);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Intermediate_second.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Hard_second_activity.class);
                startActivity(intent);
            }
        });
    }



    public void before(View view)
    {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void after(View view)
    {
        Intent intent = new Intent(MainActivity.this, Intermediate_second.class);
        startActivity(intent);
    }

    public void hard(View view)
    {
        Intent intent = new Intent(MainActivity.this, Hard_second_activity.class);
        startActivity(intent);
    }


    public void food(View view)
    {
        Intent intent = new Intent(MainActivity.this, FoodActivity.class);
        startActivity(intent);
    }
}