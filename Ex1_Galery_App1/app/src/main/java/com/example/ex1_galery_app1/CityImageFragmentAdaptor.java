package com.example.ex1_galery_app1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;


public  class CityImageFragmentAdaptor extends FragmentStatePagerAdapter {

    List<Integer> images;

    public CityImageFragmentAdaptor (@NonNull FragmentManager fm, List<Integer> images) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.images = images;
    }


    @NonNull
    @Override
    public Fragment  getItem(int position) {
       CityImageFragment fragment = new CityImageFragment();
        Bundle b = new Bundle();
        b.putInt("image" , images.get(position));
        fragment.setArguments(b);



        return fragment;
    }

    @Override
    public int getCount() {
        return images.size()    ;
    }
}
