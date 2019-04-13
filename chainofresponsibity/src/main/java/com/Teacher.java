package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月25日23:54
 *
 */
public class Teacher extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 2) {
            System.out.println("班主任批准休假 " + leaveDays + " 天...");
        }else{
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);

            }else {
                System.out.println("No One Can approve request~~~");
            }

        }
    }
}
