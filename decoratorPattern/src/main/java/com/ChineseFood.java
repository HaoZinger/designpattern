package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月13日14:39
 *
 */
public class ChineseFood extends Food {

    protected Food food;

    public ChineseFood(Food food) {
        this.food = food;
    }

    private ChineseFood() {
    }

    @Override
    public String species() {
        return this.food.species();
    }

    @Override
    public double price() {
        return this.food.price();
    }

    /**
     拓展方法  评价
     */
    public String appraise() {
        return "chinese food's appraise";
    }

}
