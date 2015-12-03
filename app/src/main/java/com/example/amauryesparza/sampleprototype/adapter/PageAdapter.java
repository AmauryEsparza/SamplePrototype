package com.example.amauryesparza.sampleprototype.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.amauryesparza.sampleprototype.pages.PagerBarList;
import com.example.amauryesparza.sampleprototype.pages.PagerBarMap;

/**
 * Created by AmauryEsparza on 11/24/15.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    private int numTabs;

    public PageAdapter(FragmentManager fragmentManager, int numTabs){
        super(fragmentManager);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                return new PagerBarList();
            default:
                return new PagerBarMap();
        }
    }

    @Override
    public int getCount(){
        return numTabs;
    }
}
