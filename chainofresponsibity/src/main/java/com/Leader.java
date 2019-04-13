package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月25日23:49
 *
 */
public abstract class Leader {

    private Leader next;

    public abstract void handleRequest(int leaveDays);

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }
}
