package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月11日22:10
 *
 */
public class Teacher extends AbstractLeader {

    @Override
    public void approveDay(int day) {
        if (day < 7) {
            System.out.println("Teacher approved ! day is " + day);
        } else {
            this.getNext().approveDay(day);
        }
    }
}
