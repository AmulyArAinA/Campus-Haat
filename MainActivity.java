package com.example.bestbuy.campus_haat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView3);
        String[] list = new String[]{
                "Hostel",
                "PG",
                "Apartment Flat"
        };


        List<String> stay = new ArrayList<String>(Arrays.asList(list));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, stay);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    Intent option1 = new Intent(getApplicationContext(), hostel.class);
                    startActivity(option1);
                } else if (position == 1) {
                    Intent option2 = new Intent(getApplicationContext(), pg.class);
                    startActivity(option2);
                } else if (position == 2) {
                    Intent option3 = new Intent(getApplicationContext(), apartment.class);
                    startActivity(option3);
                }
            }
        });
    }
}
