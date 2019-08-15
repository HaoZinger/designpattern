package com;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月30日17:19
 * 对集合进行筛选 jdk1.8特性
 * 关注的是做什么 而不是怎么做
 */
public class Listdemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

//        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));



    }
}
