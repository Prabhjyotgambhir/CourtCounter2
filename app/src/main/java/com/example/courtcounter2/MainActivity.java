package com.example.courtcounter2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamascore = 0;
    int teambscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void teama_1score(View view)
    {
        teamascore= teamascore +1;
        teamadisplay(teamascore);
    }
    public void teama_2score(View view)
    {
        teamascore= teamascore +2;
        teamadisplay(teamascore);
    }
    public void teama_3score(View view)
    {
        teamascore= teamascore +3;
        teamadisplay(teamascore);
    }
    public void teamadisplay(int number)
    {
        TextView view_a = (TextView) findViewById(R.id.teama_score);
        view_a.setText("" + number);
    }
    public void teamb_1score(View view)
    {
        teambscore= teambscore +1;
        teambdisplay(teambscore);
    }
    public void teamb_2score(View view)
    {
        teambscore= teambscore +2;
        teambdisplay(teambscore);
    }
    public void teamb_3score(View view)
    {
        teambscore= teambscore +3;
        teambdisplay(teambscore);
    }
    public void teambdisplay(int number)
    {
        TextView view_a = (TextView) findViewById(R.id.teamb_score);
        view_a.setText("" + number);
    }
    public void resitit(View view)
    {
        teamascore = 0;
        teambscore = 0;
        teamadisplay(teamascore);
        teambdisplay(teambscore);
    }


}
