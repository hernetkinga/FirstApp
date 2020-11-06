package com.example.catadviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();
    //Called when the button gets clicked
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    public void onClickFindBeer(View view) {
//Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
//Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
//Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
//Get recommendations from the BeerExpert class
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
//Display the beers
        brands.setText(brandsFormatted);

    }
}

