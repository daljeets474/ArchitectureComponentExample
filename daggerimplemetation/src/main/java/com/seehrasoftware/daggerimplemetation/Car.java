package com.seehrasoftware.daggerimplemetation;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    @Inject Engine engine;
    @Inject Wheels wheels;

    private static final String TAG = "Car";

    @Inject
    public Car(){

    }

    public void drive(){
        Log.d(TAG, "driving.......... ");
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListeners(this);
    }

}
