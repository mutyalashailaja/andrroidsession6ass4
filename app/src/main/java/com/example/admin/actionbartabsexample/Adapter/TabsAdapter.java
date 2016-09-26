package com.example.admin.actionbartabsexample.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



/**
 * Created by Admin on 25-09-2016.
 */
public class TabsAdapter extends FragmentPagerAdapter{

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Fragment1();
            case  1:
                return new Fragment2();

        }
        return null;
    }



    @Override
    public int getCount() {
        return 2;
    }
}
