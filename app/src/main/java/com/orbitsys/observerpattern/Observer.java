package com.orbitsys.observerpattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
