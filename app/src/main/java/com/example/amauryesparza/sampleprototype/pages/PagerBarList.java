package com.example.amauryesparza.sampleprototype.pages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amauryesparza.sampleprototype.R;

/**
 * Created by AmauryEsparza on 11/29/15.
 */
public class PagerBarList extends Fragment {

    public PagerBarList(){}

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.pager_barlist, container, false);
    }
}
