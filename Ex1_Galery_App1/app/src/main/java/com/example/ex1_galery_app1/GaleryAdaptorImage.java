package com.example.ex1_galery_app1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class GaleryAdaptorImage  extends BaseAdapter {

    List<Integer> Idsimage;
    Context galarey_context;

    public GaleryAdaptorImage(List<Integer> Idsimage, Context galarey_context) {

        this.Idsimage = Idsimage;
        this.galarey_context = galarey_context;

    }

    @Override
    public int getCount() {
        return Idsimage.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ImageView imageView = (ImageView) convertView;

        if (imageView == null) {

            imageView = new ImageView(galarey_context);
            imageView.setLayoutParams(new GridView.LayoutParams(350, 450));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);


        }

        imageView.setImageResource(Idsimage.get(position));

        return imageView;
    }

}
