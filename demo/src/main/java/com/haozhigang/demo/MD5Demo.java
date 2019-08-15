package com.haozhigang.demo;

import com.haozhigang.demo.utils.MD5;

/**
 *
 *
 * @author Haozhigang
 *
 *  2018年12月20日20:08
 *
 */
public class MD5Demo {
    public static void main(String[] args) throws Exception {
        String authcode = MD5.digest("dengzhigang" + "1545307211000" + "Hso2ThxNiSof");

        System.err.println(authcode);
    }
}
