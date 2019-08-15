package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月11日22:13
 *
 */
public class Dean extends AbstractLeader {
    @Override
    public void approveDay(int day) {
        if (day < 15) {
            System.out.println("Dean approbed ! day is " + day);
        } else {
            System.out.println("not approved");
        }
    }
}
