package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月11日22:49
 *
 */
public class context {
    private WorkStrategy strategy;

    public context() {
    }

    protected context(WorkStrategy strategy) {
        this.strategy = strategy;
    }

    void strategy() {
        this.strategy.goToWork();

    }
}
