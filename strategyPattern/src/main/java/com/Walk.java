package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月11日22:47
 *
 */
public class Walk implements WorkStrategy {
    @Override
    public void goToWork() {
        System.out.println("walk to company today~~~");
    }
}
