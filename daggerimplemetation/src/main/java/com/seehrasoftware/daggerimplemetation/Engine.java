package com.seehrasoftware.daggerimplemetation;

import android.util.Log;

import javax.inject.Inject;

public class Engine {

    private static final String TAG = "Engine";
    @Inject
    public Engine(){

    }

    public void getEngineDetails(){
        Log.d(TAG, "Engine is 1200 CC ");
    }
}
