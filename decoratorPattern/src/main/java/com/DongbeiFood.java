package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月13日14:51
 *
 */
public class DongbeiFood extends ChineseFood {
    public DongbeiFood(Food food) {
        super(food);
    }

    @Override
    public String species() {
        return "东北" + food.species();
    }

    @Override
    public double price() {
        return food.price() + 5d;
    }

    @Override
    public String appraise() {
        return "吃不完！！！";
    }
}
