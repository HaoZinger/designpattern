package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月13日14:49
 *
 */
public class SichuanFood extends ChineseFood {
    public SichuanFood(Food food) {
        super(food);
    }

    @Override
    public String species() {
        return "四川" + food.species();
    }

    @Override
    public double price() {
        return food.price() + 2d;
    }

    @Override
    public String appraise() {
        return "辣！！！";
    }
}
