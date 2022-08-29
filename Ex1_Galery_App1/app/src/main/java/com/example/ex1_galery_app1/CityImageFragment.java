package com.example.ex1_galery_app1;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class CityImageFragment extends Fragment {



    public CityImageFragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v  = inflater.inflate(R.layout.fragment_city_image, container, false);
        ImageView imageView = v.findViewById(R.id.image);
        int imageSrc = getArguments().getInt("image");
        imageView.setImageResource(imageSrc);
        return v;
    }
}