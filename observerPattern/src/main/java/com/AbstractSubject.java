package com;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月12日20:29
 *
 */
public abstract class AbstractSubject {
    private List<AbstractObserver> observers = new ArrayList<AbstractObserver>();

    public void attach(AbstractObserver observer) {
        this.observers.add(observer);
    }

    public void detach(AbstractObserver observer) {
        this.observers.remove(observer);
    }

    protected void notifyObservers(int num) {
        this.observers.forEach((x) -> x.update(num));
    }

    public abstract void update(int num);

}
