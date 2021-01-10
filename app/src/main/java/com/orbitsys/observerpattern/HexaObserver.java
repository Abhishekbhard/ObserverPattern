package com.orbitsys.observerpattern;

import android.util.Log;

public class HexaObserver extends Observer{
    public static final String TAG="@@@";
    
    public HexaObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        Log.d(TAG, "Hexa String: " + Integer.toHexString( subject.getState()).toUpperCase());
        
    }
}
