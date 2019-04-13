package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月13日18:06
 *
 */
public class ChinaPowerAdapter implements DC5adapter {
    @Override
    public boolean support(AC ac) {
        return ac.outputAC() == 220;
    }

    @Override
    public int outputDC5(AC ac) {
        int outputAC = ac.outputAC();
        System.out.println("ChinaPowerAdapter: change Ac \t" + ac.outputAC() + "\tto: " + outputAC / 44);
        return 5;
    }
}
