package com.example.android.cricketscroreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    class country{

    }
    int scoreIndia = 0;
    int scoreAustralia = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void singleAustralia(View view){
        this.scoreAustralia++;
        updateDisplays();
    }

    public void doubleAustralia(View view){
        this.scoreAustralia += 2;
        updateDisplays();
    }

    public void fourAustralia(View view){
        this.scoreAustralia += 4;
        updateDisplays();
    }

    public void sixAustralia(View view){
        this.scoreAustralia += 6;
        updateDisplays();
    }

    public void singleIndia(View view){
        this.scoreIndia++;
        updateDisplays();
    }

    public void doubleIndia(View view){
        this.scoreIndia += 2;
        updateDisplays();
    }

    public void fourIndia(View view){
        this.scoreIndia += 4;
        updateDisplays();
    }

    public void sixIndia(View view){
        this.scoreIndia+= 6;
        updateDisplays();
    }

    private void updateDisplays() {
        TextView scoreAustraliaView = (TextView) findViewById(R.id.score_australia);
        TextView scoreIndiaView = (TextView) findViewById(R.id.score_india);
        scoreAustraliaView.setText("" + this.scoreAustralia);
        scoreIndiaView.setText("" + this.scoreIndia);
    }
}
