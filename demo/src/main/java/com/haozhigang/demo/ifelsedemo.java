package com.haozhigang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * @author Haozhigang
 *
 *  2018年12月08日14:31
 *
 */
@SpringBootApplication
public class ifelsedemo {
    public static void main(String[] args) {
        SpringApplication.run(ifelsedemo.class,args);
        String[] strArr = { "1", "2" };
        for (String s : strArr) {
            System.err.println(s);
        }





    }
}
