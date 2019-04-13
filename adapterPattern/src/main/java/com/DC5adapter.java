package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月13日18:03
 *
 */
public interface DC5adapter {
    boolean support(AC ac);
    int outputDC5(AC ac);
}
