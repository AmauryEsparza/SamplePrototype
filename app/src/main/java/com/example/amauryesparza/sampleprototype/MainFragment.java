package com.example.amauryesparza.sampleprototype;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amauryesparza.sampleprototype.communicator.IFragmentEventCallback;


/**
 * Created by AmauryEsparza on 11/24/15.
 */
public class MainFragment extends Fragment implements View.OnClickListener {


    //Callback to the activity
    IFragmentEventCallback fragmentCallback;
    public MainFragment() {


    }


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof Activity){
            //Callback instance
            fragmentCallback = (IFragmentEventCallback) context;
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Setup the components, like buttons, text, view, etc.
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public void onClick(View v){


    }
}
