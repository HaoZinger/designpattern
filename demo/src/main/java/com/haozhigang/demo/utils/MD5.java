package com.haozhigang.demo.utils;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;

/**
 * Thuisoft Inc. All rights reserved.
 *
 * @author hewei
 * @version Version 1.0.0
 */
public final class MD5 {

    public MD5() {
    }

    public static byte[] getDigest(String source) throws Exception {
        return source == null ? null : DigestUtils.md5(source);
    }

    public static String digest(String source) throws Exception {
        return source == null ? null : DigestUtils.md5Hex(source);
    }

    public static String encodeMD5(String sString) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        md5.update(sString.getBytes("UTF-8"));
        byte[] abResult = md5.digest();

        return byte2hex(abResult);
    }

    public static String byte2hex(byte[] data) {
        if (data == null) {
            return null;
        }
        return new String(Hex.encodeHex(data));
    }

    /**
     * 加盐MD5
     * @param password 加密前密码
     * @param id 账号id
     * @return
     */
    public static String saltPsw(String password, String id) {
        //盐是id
        return DigestUtils.md5Hex(password + id);
    }

}
