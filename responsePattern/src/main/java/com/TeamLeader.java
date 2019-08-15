package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月11日22:07
 *
 */
public class TeamLeader extends AbstractLeader {


    @Override
    public void approveDay(int day) {
        if (day < 3) {
            System.out.println("Teacher approved ! day is " + day);
        }else{
            this.getNext().approveDay(day);
        }

    }
}
