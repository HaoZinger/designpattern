package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月26日0:30
 *
 */
public class DepartmentHead extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("DepartmentHead allow " + leaveDays + " days~~~");
        } else if (getNext() != null) {
            getNext().handleRequest(leaveDays);
        } else {
            System.out.println("no one can approve your request~~~");
        }
    }
}
