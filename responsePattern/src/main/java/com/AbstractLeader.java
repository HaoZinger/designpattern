package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月11日21:41
 *
 */
public abstract class AbstractLeader {
    private AbstractLeader next;
    protected AbstractLeader getNext() {
        return this.next;
    }

    public void setNext(AbstractLeader next) {
        this.next = next;
    }

    public abstract void approveDay(int day);

}
