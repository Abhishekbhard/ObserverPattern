package com.orbitsys.observerpattern;

import android.util.Log;

public class BinaryObserver  extends Observer{
    public static final String TAG="@@@";

    public  BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);

    }
    @Override
    public void update() {
        Log.d(TAG, "Binary String: "+Integer.toBinaryString(subject.getState()));

    }
}
