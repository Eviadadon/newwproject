package com.example.aratzot ;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    TextView tvpop , tvcap;
    ListView LVLANDS;
    String[][] m = {{"Egypt", "South Africa", "Tanzania", "Sudan", "Algeria", "Ethiopia", "Nigeria"}, {"Greece", "Germany", "Turkey", "France", "United Kingdom", "Italy", "Spain"}, {"israel", "China", "India", "Nepal", "Saudi Arabia", "Yemen", "Indonesia"}, {"Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Peru"}, {"Bahamas", "Barbados", "Canada", "Cuba", "Costa Rica", "El Salvador", "United States of America"}};

    String[][] m2 = {{"Cairo", "Cape Town", "Dodoma", "Khartoum", "Algiers", "Addis Ababa", "Abuja", "Athens", "Berlin", "Ankara", "Paris", "London", "Rome", "Madrid", "Jerusalem", "Beijing", "New Delhi", "Kathmandu", "Riyadh", "Sana'a", "Jakarta", "Buenos Aires", "La Paz", "Brasilia", "Santiago", "Bogotá", "Quito", "Lima", "Nassau", "Bridgetown", "Ottawa", "Havana", "San Jose", "San Salvador", "Washington, D.C."},

            {"98,002,045", "58,558,270", "51,046,000", "40,235,000", "40,100,000", "112,078,730", "200,963,599", "10,768,193", "82,887,000", "82,003,882", "67,372,000", "66,040,229", "60,390,560", "46,733,038", "8,372,000", "1,387,160,730", "1,324,009,090", "28,038,000", "26,849,000", "26,745,000", "255,462,000", "43,132,000", "10,520,000", "204,519,000", "18,006,000", "45,549,000", "16,279,000", "31,153,000", "422,678", "381,320", "37,279,800", "11,221,060", " 5,003,393", "6,643,359", " 327,929,000"}};
    /**
     * data that pops up when the user clicks- clicking on a continent will pop up the continent's states, clicking on a continent will pop up the capital city and the number of residents
     *
     */
    int x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LVLANDS = (ListView) findViewById(R.id.LVLANDS);
        tvcap = (TextView) findViewById(R.id.tvcap);
        tvpop = (TextView) findViewById(R.id.tvpop);
        Intent gi = getIntent();
        x1 = gi.getIntExtra("position", 2);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, m[x1]);
        LVLANDS.setChoiceMode(ListView.CHOICE_MODE_SINGLE); /** remember : default */
        LVLANDS.setOnItemClickListener(this);/**
         * associate the listener to the component*/
        LVLANDS.setAdapter(adp);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        tvcap.setText("Capital City: " + m2[0][x1 * 7 + position]);
        tvpop.setText("Population: " + m2[1][x1 * 7 + position]);
    }

    /**
     * Reference to the selected continent's and country's data
     * @param view
     */
    public void btn2(View view) {
        finish();
    }
}


