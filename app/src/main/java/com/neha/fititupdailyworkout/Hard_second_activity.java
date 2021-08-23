package com.neha.fititupdailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Hard_second_activity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_second);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        newArray = new int[]
                {
                        R.id.exh1, R.id.exh2, R.id.exh3, R.id.exh4, R.id.exh5, R.id.exh6,
                        R.id.exh7, R.id.exh8, R.id.exh9, R.id.exh10, R.id.exh11, R.id.exh12,
                        R.id.exh13, R.id.exh14, R.id.exh15,

                };
    }


    public void imagebuttonclicked(View view) {
        for (int i = 0; i<newArray.length; i++)
        {
            if (view.getId() == newArray[i])
            {
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(Hard_second_activity.this,ThirdActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void poseclicked(View view) {
    }
}