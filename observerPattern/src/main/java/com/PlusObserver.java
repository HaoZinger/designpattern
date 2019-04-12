package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月12日20:36
 *
 */
public class PlusObserver extends AbstractObserver {

    @Override
    void update(int num) {
        System.out.println("origin num is " + num + " after plus 1 , num change to " + (num + 1));
    }
}
