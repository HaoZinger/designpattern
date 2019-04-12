package com.main;

import com.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)

    {
        AbstractSubject subject = new Subject();
        AbstractObserver observerPlus = new PlusObserver();
        AbstractObserver observerSubs = new SubObserver();
        subject.attach(observerPlus);
        subject.attach(observerSubs);
        subject.update(100);

    }
}
