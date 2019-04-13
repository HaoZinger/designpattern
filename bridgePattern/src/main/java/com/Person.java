package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月13日16:55
 *
 */
public abstract class Person {
    protected Eatable eatable;

    public Eatable getEatable() {
        return eatable;
    }

    public void setEatable(Eatable eatable) {
        this.eatable = eatable;
    }

}
