package com.orbitsys.observerpattern;

import android.util.Log;

public class OctalObserver extends Observer{
    public static final String TAG="@@@";
    public OctalObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);

    }
    @Override
    public void update() {
        Log.d(TAG, "Octal String: " +Integer.toOctalString( subject.getState()));

    }
}
