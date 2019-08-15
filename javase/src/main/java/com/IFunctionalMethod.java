package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月01日21:27
 *
 */
public interface IFunctionalMethod {

    void FunctionalMethod(String x);
    default void DefaultMethod() {
        System.out.println("in Functional Method");
    }

}
