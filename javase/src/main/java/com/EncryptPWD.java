package com;

import com.thunisoft.summer.component.crypto.CryptConsts;
import com.thunisoft.summer.component.crypto.CryptUtil;
import com.thunisoft.summer.component.crypto.util.ConversionUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class EncryptPWD {
    public static final String RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSwX2rvj452a8JP6RcssoqPmQH5lXgVM4TZE/RsGiOwk0waLhCAMA4Q/vnoy88nsl6QPyTC/kG8JedHjFnjcwcN1Z7cORY1MkruO5urGfNMXeMnvGTb969PYRiOYvyvzHJgjB/IVDOD8HFhhfeT9tncBo/a8ceinXWkfvMBbsH1QIDAQAB";

    public static void main(String[] args) throws IOException {
        try {
            /*
            tap-dev.thunisoft.com/uim-api/api/users/check?
            loginId=test433&
            password=cFLKFYgcfLhyWI3qE8gjw9Ip9UGli5wRD2WDCcf9V1gKoPULWX/jrXSakVhYR+6LsDWf33F0zvq8c6icZ0hb6kdL58Q5DfvgnlB/oSBliwdJLdZzfgWWBE8VOfpH6UrCJPjikGe4p85Qy2+yxrYzzDOB4i3P/2p55wrOPYNZL/A=
             */
            String loginId = "test433";
            String originPwd = "123";
            String encryptPwd = encrypt(originPwd);
            String url = "http://tap-dev.thunisoft.com/uim-api/api/users/check?loginId=" + loginId + "&password=" + encryptPwd;
            HttpGet httpGet = new HttpGet(url);
            HttpClient client = HttpClients.createDefault();
            HttpResponse httpResponse = client.execute(httpGet);
            String respContent = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            System.out.println(respContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String encrypt(String originPwd) throws IOException {
        byte[] b = originPwd.getBytes();
        byte[] keyInByte = ConversionUtils.decodeBase64(RSA_PUBLIC_KEY);
        byte[] keyInByte2 = Base64.decodeBase64(RSA_PUBLIC_KEY);
        String encryptPwd = CryptUtil.encrypt(CryptConsts.ALGORITHM_RSA, b, keyInByte);
        return encryptPwd;
    }

}
