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


    }

    private static void decoratorMethod() {
        Food chineseFood = new ChineseFood(new SichuanFood(new WestFood()));
        Food dongbeiFood = new ChineseFood(new DongbeiFood(new WestFood()));
        System.out.println("getChineseFood-->\tspecies:" + chineseFood.species() + "\tprice:" + chineseFood.price());
        System.out.println("getDongbeiFood-->\tspecies:" + dongbeiFood.species() + "\tprice:" + dongbeiFood.price());

    }

    private static void originMethod() {
        Food westFood = new WestFood();
        System.out.println("getWestFood-->\tspecies:" + westFood.species() + "\tprice:" + westFood.price());
    }
}