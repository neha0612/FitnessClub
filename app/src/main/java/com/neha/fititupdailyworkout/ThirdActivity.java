package com.neha.fititupdailyworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    String buttonvalue;
    Button startbtn;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private boolean MTimeRunning;
    private long MTimeLeftRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        buttonvalue = intent.getStringExtra("value");

        int intvalue = Integer.valueOf(buttonvalue);

        switch (intvalue)
        {
            case 1:
                setContentView(R.layout.activity_boat_pose);
                break;

            case 2:
                setContentView(R.layout.activity_pose2);
                break;

            case 3:
                setContentView(R.layout.activity_pose3);
                break;

            case 4:
                setContentView(R.layout.activity_pose4);
                break;

            case 5:
                setContentView(R.layout.activity_pose5);
                break;

            case 6:
                setContentView(R.layout.activity_pose6);
                break;

            case 7:
                setContentView(R.layout.activity_pose7);
                break;

            case 8:
                setContentView(R.layout.activity_pose8);
                break;

            case 9:
                setContentView(R.layout.activity_pose9);
                break;

            case 10:
                setContentView(R.layout.activity_pose10);
                break;

            case 11:
                setContentView(R.layout.activity_pose11);
                break;

            case 12:
                setContentView(R.layout.activity_pose12);
                break;

            case 13:
                setContentView(R.layout.activity_pose13);
                break;

            case 14:
                setContentView(R.layout.activity_pose14);
                break;

            case 15:
                setContentView(R.layout.activity_pose15);
                break;
        }
        startbtn = findViewById(R.id.startbtn);
        mtextview = findViewById(R.id.time);


        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MTimeRunning)
                {
                    stopTimer();
                }
                else
                {
                    startTimer();
                }
            }
        });
    }

    private void stopTimer()
    {
        countDownTimer.cancel();
        MTimeRunning=false;
        startbtn.setText("START");
    }
    private void startTimer()
    {
        final CharSequence value1 = mtextview.getText();
        String num1 = value1.toString();
        String num2 = num1.substring(0,2);
        String num3 = num1.substring(3,5);

        final int number = Integer.valueOf(num2) * 60+ Integer.valueOf(num3);
        MTimeLeftRunning = number*1000;

        countDownTimer = new CountDownTimer(MTimeLeftRunning,1000) {
            @Override
            public void onTick(long millisUntilFinished)
            {
                MTimeLeftRunning = millisUntilFinished;
                updateTimer();

            }

            @Override
            public void onFinish()
            {
                int newValue = Integer.valueOf(buttonvalue)+1;
                if(newValue<=7)
                {
                    Intent intent = new Intent(ThirdActivity.this,ThirdActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newValue));
                    startActivity(intent);
                }
                else
                {
                    newValue = 1;
                    Intent intent = new Intent(ThirdActivity.this,ThirdActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newValue));
                    startActivity(intent);
                }

            }
        }.start();
        startbtn.setText("PAUSE");
        MTimeRunning = true;
    }
    private void updateTimer()
    {
        int minutes = (int)MTimeLeftRunning/60000;
        int seconds = (int)MTimeLeftRunning%60000/1000;

        String timeLeftText="";
        if (minutes<10)
        {
            timeLeftText = "0";
            timeLeftText = timeLeftText+minutes+":";

            if(seconds<10)
            {
                timeLeftText += "0";
                timeLeftText+=seconds;
                mtextview.setText(timeLeftText);
            }

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}