package com.example.aratzot ;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

/**
 *
 */
public class MainActivity extends AppCompatActivity implements OnItemClickListener {
    int checkk = 4;
    ListView lv;
    String[] yabeshet = {"Africa", "Europe", "Asia", "America"};
    String choice;
    int ch;

    /**
     * create a dataset and a list type variable
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.LV); /**
         contact the variable with th display element */
        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, yabeshet);
        lv.setAdapter(adp);
    }

    /**
     * creating and running the adapter
     */

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast toast = Toast.makeText(this, "" + yabeshet[position], Toast.LENGTH_SHORT);
        toast.show();
        choice = yabeshet[position];
        ch = position;
        checkk=position;
/** opening a new function - add a listener who works on the lists
 * the function starts when a listview button is clicked, the function gets the cell's data
 */

    }

    public void nextact(View view) {
        if (checkk == 4) {
            Toast.makeText(this, "please click on a continent", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent gi = new Intent(this, Main2Activity.class);
            gi.putExtra("position", ch);

            startActivity(gi);
        }
    }
}
