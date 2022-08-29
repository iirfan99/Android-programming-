package com.example.ex1_galery_app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.List;

public class CityImages extends AppCompatActivity {


    ViewPager cityPager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_images);


        cityPager = findViewById(R.id.pager);
        List<Integer>  images = getIntent().getExtras().getIntegerArrayList("images");
        int currentImage = getIntent().getExtras().getInt("current");

        CityImageFragmentAdaptor adaptor = new CityImageFragmentAdaptor(getSupportFragmentManager(),images);

      cityPager.setAdapter(adaptor);
      cityPager.setCurrentItem(currentImage);
    }
}