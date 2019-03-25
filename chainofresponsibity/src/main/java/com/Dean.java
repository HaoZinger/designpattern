package com;

import javax.swing.*;
import javax.xml.transform.Source;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月26日0:33
 *
 */
public class Dean extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 14) {
            System.out.println("Dean approve you leave " + leaveDays + " days");
        } else if (getNext() != null) {
            getNext().handleRequest(leaveDays);
        } else {
            System.out.println("no one can approve your request");

        }

    }
}
