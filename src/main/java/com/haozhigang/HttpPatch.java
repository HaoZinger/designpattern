package com.haozhigang;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 *
 *
 * @author Haozhigang
 *
 *  2018年11月15日21:01
 *
 */
public class HttpPatch  {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.err.println(URLEncoder.encode("消息通知", "utf-8"));
    }

}
