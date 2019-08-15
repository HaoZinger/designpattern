package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月30日17:34
 *
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.stream();
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
//        stream.forEach((name) -> System.out.println(name));

        Stream<String> 张 = stream.filter((name) -> name.startsWith("张"));
        张.forEach(name -> System.out.println(name));

    }
}
