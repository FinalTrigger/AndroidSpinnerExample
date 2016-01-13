package com.leetinsider.spinnerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/*
First we are importing the layout items.
An array of colors is defined as “String[] colors = {}”.
Next an ArrayAdapter is created using the defined colors Array.
Finally apply the ArrayAdapter to the spinner.
On selecting the spinner it shows a dropdown list of values.
When you select a value from the dropdown spinner it shows the selected value in Toast.
 */
public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    String[] colors = {
            "Red",
            "Blue",
            "Green",
            "Yellow",
            "Orange",
            "Purple",
            "Pink",
            "Black",
            "White"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, colors);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "You have selected " + colors[position], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
