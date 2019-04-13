package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月13日18:10
 *
 */
public class JapanPowerAdapter implements DC5adapter {
    @Override
    public boolean support(AC ac) {
        return ac.outputAC() == 110;
    }

    @Override
    public int outputDC5(AC ac) {
        int outputAC = ac.outputAC();
        System.out.println("JapanPowerAdapter: change AC \t" + ac.outputAC() + "\tto: " + outputAC / 22);
        return 5;
    }
}
