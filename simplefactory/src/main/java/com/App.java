package com;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String[] strArr = { "1", "2" };
        Map map = new HashMap();
        for (String s : strArr) {
            IgetInput getInput = (IgetInput) map.get(s);
            getInput.getInput(s);
        }


    }
}
