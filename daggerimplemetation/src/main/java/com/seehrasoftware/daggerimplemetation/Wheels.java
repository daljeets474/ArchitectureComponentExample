package com.seehrasoftware.daggerimplemetation;

import android.util.Log;

public class Wheels {

    private static final String TAG = "Wheels";
    private Rims rims;
    private Tyres tyres;

    public Wheels(Tyres tyres, Rims rims) {
        this.rims = rims;
        this.tyres = tyres;
    }


    public void getWheelsDetails() {
        Log.d(TAG, "Car has 4 Wheels");
    }
}
