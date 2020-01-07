package edu.ggc.espinosa.wbuildingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToFloorOne (View v){
        startActivity(new Intent(MainActivity.this, FlooroneActivity.class));
    }
    public void goToFloorTwo (View v){
        startActivity(new Intent(MainActivity.this, FloortwoActivity.class));
    }
    public void goToFloorThree (View v){
        startActivity(new Intent(MainActivity.this, FloorthreeActivity.class));
    }
    public void goToCampusMap (View v){
        startActivity(new Intent(MainActivity.this, CampusActivity.class));
    }
    public void goTOAbout (View v){
        startActivity(new Intent(MainActivity.this, AboutActivity.class));
    }
}
