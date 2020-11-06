package com.example.catadviser;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindBeer(View view) {
        //Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
//Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
//Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
//Display the selected item
        brands.setText(beerType);
    }
}