package com.example.acer.myguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<information> {

    Adapter(Context c, ArrayList<information> array) {

        super(c, R.layout.template, array);

    }


    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.template, parent, false);
        }

        information info = getItem(position);

        ImageView img = listItemView.findViewById(R.id.image);
        img.setImageResource(info.getmImage());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(String.valueOf(info.getmName()));

        TextView city = (TextView) listItemView.findViewById(R.id.address);
        city.setText(String.valueOf(info.getmAddress()));


        return listItemView;
    }
}