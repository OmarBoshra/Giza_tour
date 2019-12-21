package com.example.acer.myguide;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class hotels extends Fragment {
    private int imges;
    private String name;
    private String address;
    private ArrayList<information> info;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hotels, null);


        ListView lv = view.findViewById(R.id.listhotels);


        info = new <information>ArrayList();

        TypedArray arrDrawerIcons = getResources().obtainTypedArray(R.array.images);

        for (int i = 4; i < 8; i++) {
            imges = arrDrawerIcons.getResourceId(i, 0);
            name = getResources().getStringArray(R.array.places)[i];
            address = getResources().getStringArray(R.array.addresses)[i];
            info.add(new information(name, address, imges));
        }
        Adapter adapter = new Adapter(getActivity(), info);


        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent viewdata = new Intent(getActivity(), viewinfo.class);
                viewdata.putExtra("imag", info.get(position).getmImage());
                viewdata.putExtra("address", info.get(position).getmAddress());
                viewdata.putExtra("name", info.get(position).getmName());
                startActivity(viewdata);
            }
        });


        lv.setAdapter(adapter);
        return view;
    }
}
