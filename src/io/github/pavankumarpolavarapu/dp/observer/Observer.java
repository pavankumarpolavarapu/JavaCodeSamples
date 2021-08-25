package io.github.pavankumarpolavarapu.dp.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}