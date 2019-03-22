package com.example.bestbuy.campus_haat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class hostel extends AppCompatActivity {
    String[] list4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel);

        ListView hostelListView = findViewById(R.id.hostelListView);
         list4 = new String[]{
                "Hostel ABC",
                "Hostel DEF",
                "Hostel GHI"
        };



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, list4);

        hostelListView.setAdapter(arrayAdapter);

        hostelListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(getApplicationContext(),list4[position],Toast.LENGTH_SHORT).show();

            }
        });

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(goBack);
            }
        });

    }

    }

