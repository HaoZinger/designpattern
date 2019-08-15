package com.example.muticase;

import org.springframework.context.annotation.Configuration;

/**
 *
 *
 * @author Haozhigang
 *
 *  2018年12月08日14:41
 *
 */
@Configuration
public class getInputA implements IgetInput {
    @Override
    public String getInput(String string) {
        return "in getInputA:" + string;
    }
}
