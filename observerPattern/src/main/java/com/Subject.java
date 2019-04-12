package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月12日20:44
 *
 */
public class Subject extends AbstractSubject {
    @Override
    public void update(int num) {
        System.out.println("origin num is " + num);
        this.notifyObservers(num);
    }
}
