package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月12日20:38
 *
 */
public class SubObserver extends AbstractObserver {
    @Override
    void update(int num) {
        System.out.println("origin num is " + num + " after subs 1 , num change to " + (num - 1));
    }
}
