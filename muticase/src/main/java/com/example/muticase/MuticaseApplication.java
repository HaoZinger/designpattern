package com.example.muticase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class MuticaseApplication {
    @Autowired

    public static void main(String[] args) {
        SpringApplication.run(MuticaseApplication.class);
        Map<String, IgetInput> getInputMap = new configMap<>();
        String[] str = { "one", "two}" };
        List l = new ArrayList();
        for (String string : str) {
            IgetInput get = getInputMap.get(string);
            if (get != null) {
                l.add(get.getInput(string));
            }
        }
        System.err.println(l);
    }

}

