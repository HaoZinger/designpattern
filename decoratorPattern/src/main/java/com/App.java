package com;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)

    {
        originMethod();
        System.out.println("============");
        decoratorMethod();
        System.out.println("************");
        SichuanFood sichuanFood = new SichuanFood(new WestFood());
        System.out.println("getSichuanFood-->\tspecies:" + sichuanFood.species() + "\tprice:" + sichuanFood.price()+"\tappraise: "+((ChineseFood) sichuanFood).appraise());

    }

    private static void decoratorMethod() {
        Food chineseFood = new ChineseFood(new SichuanFood(new WestFood()));
        Food dongbeiFood = new ChineseFood(new DongbeiFood(new WestFood()));
        System.out.println("getChineseFood-->\tspecies:" + chineseFood.species() + "\tprice:" + chineseFood.price()+"\tappraise"+((ChineseFood) chineseFood).appraise());
        System.out.println("getDongbeiFood-->\tspecies:" + dongbeiFood.species() + "\tprice:" + dongbeiFood.price()+"\tappraise"+((ChineseFood) dongbeiFood).appraise());

    }

    private static void originMethod() {
        Food westFood = new WestFood();
        System.out.println("getWestFood-->\tspecies:" + westFood.species() + "\tprice:" + westFood.price());
    }
}