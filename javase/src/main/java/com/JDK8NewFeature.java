package com;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月01日21:06
 *
 */
public class JDK8NewFeature {
    public static void main(String[] args) {
        //        oldMethod();
        //        newMethod();
        //        newMethod2();
        //        defaultMethod();
        //        lambdaCompare();
        //        sso();
        //        mutlCons();
        //        stream1();
        //        streamMapReduce();
        //        streamMap();
        //        streamList();
        streamfield();
    }

    private static void streamfield() {
        Persion tom = new Persion(1, "tom");
        Persion jerry = new Persion(2, "jerry");
        Persion dog = new Persion(3, "dog");
        ArrayList<Persion> persions = new ArrayList<>();
        persions.add(tom);
        persions.add(jerry);
        persions.add(dog);
        Set<String> collect = persions.stream().map(x -> x.getName()).collect(Collectors.toSet());
        System.out.println(collect);
    }

    private static void streamList() {
        List<String> list = Arrays.asList("aA", "bB", "cC");
        //        Set<String> set = list.stream().map((x) -> x.toUpperCase()).collect(Collectors.toSet());
        //        System.out.println(set);

        System.out.println(list.stream().reduce((a, b) -> a.concat(b)).get());
    }

    private static void streamMapReduce() {
        Stream<Integer> num = Stream.of(1, 2, 3, 4);
        System.out.println(num.map((x) -> x % 2 == 0 ? x : 0).reduce((integer, integer2) -> integer + integer2));
    }

    private static void streamMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "aaa");
        map.put("2", "bbb");
        map.put("3", "ccc");
        map.put("4", "ddd");
        Stream<Set<String>> keys = Stream.of(map.keySet());
        //        keys.filter((a) -> Integer.parseInt(a.toString()) > 2).forEach((x) -> System.out.println(x));
        keys.forEach((a) -> System.out.println(a));
    }

    private static void stream1() {
        Stream<String> stream = Stream.of("abc", "bcd", "d", "c");
        System.out.println(stream.filter((ele) -> ele.contains("b")).count());
        //        stream.forEach((x) -> System.out.println(x.concat("xxx")));
    }

    private static void mutlCons() {
        PersionFactory p = Persion::new;
        Persion persion = p.createPersion(5, "tom");
    }

    private static void lambdaCompare() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "fore");
        List<String> l = new ArrayList<>();
        l.add("one");
        l.add("2");
        l.add("three");
        l.add("four");

        Collections.sort(l, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        System.out.println(l);
        Collections.sort(l, (a, b) -> b.toString().length() - a.toString().length());
        System.out.println(l);
        Collections.sort(l, Comparator.nullsFirst((String o1, String o2) -> o1.compareTo(o2)));
        System.out.println("~~~" + l);

    }

    private static void defaultMethod() {
        new FunctionalMethod().DefaultMethod();
    }

    private static void newMethod2() {
        new Thread(() -> System.out.println("this is another method for create method after JDK8")).start();
    }

    private static void newMethod() {
        new Thread(() -> {
            System.out.println("this is one method for create method after JDK8");
        }).start();
    }

    private static void oldMethod() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is method for create thread before JDK8");
            }
        }).start();
    }

}
