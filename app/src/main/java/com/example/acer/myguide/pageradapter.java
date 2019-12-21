package com.example.acer.myguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by zero on 11/04/2017.
 */

public class pageradapter extends FragmentStatePagerAdapter {


    public pageradapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                toursites f1 = new toursites();
                return f1;
            case 1:
                hotels f2 = new hotels();
                return f2;
            case 2:
                resturants f3 = new resturants();
                return f3;
            default:
                malls f4 = new malls();

                return f4;

        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
