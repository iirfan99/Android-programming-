package com.example.ex1_galery_app1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;


import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {


    GridView gridView;

    ArrayList<Integer>  images = new ArrayList<>(Arrays.asList(

            R.drawable.warsaw,R.drawable.wroclaw,R.drawable.krakow,R.drawable.gdansk,
            R.drawable.poznan,R.drawable.lodz,R.drawable.katowice,R.drawable.zakopane,
            R.drawable.szczecin,R.drawable.gliwice,R.drawable.olsztyn,R.drawable.bialymstok

    ));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gridView = findViewById(R.id.gridview_image);

        GaleryAdaptorImage imageAdaptor  = new GaleryAdaptorImage(images,this);
        gridView.setAdapter(imageAdaptor);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i  = new Intent(MainActivity.this,CityImages.class);
                i.putExtra("images",images);
                i.putExtra("current",position);
                startActivity(i);


            }
        });
    }
}