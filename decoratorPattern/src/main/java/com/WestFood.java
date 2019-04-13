package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月13日14:36
 *
 */
public class WestFood extends Food {
    @Override
    public String species() {
        return "rice";
    }

    @Override
    public double price() {
        return 40d;
    }
}
