package com.neha.fititupdailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;



public class Intermediate_second extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_second);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        newArray = new int[]
                {
                        R.id.exi1, R.id.exi2, R.id.exi3, R.id.exi4, R.id.exi5, R.id.exi6,
                        R.id.exi7, R.id.exi8, R.id.exi9, R.id.exi10, R.id.exi11, R.id.exi12,
                        R.id.exi13, R.id.exi14, R.id.exi15,

                };
    }


    public void imagebuttonclicked(View view) {
        for (int i = 0; i<newArray.length; i++)
        {
            if (view.getId() == newArray[i])
            {
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(Intermediate_second.this,ThirdActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void poseclicked(View view) {
    }
}