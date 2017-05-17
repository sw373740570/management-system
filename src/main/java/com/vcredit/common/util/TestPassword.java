package com.vcredit.common.util;

/**
 * Created by zhangzhizhong on 2017/5/2.
 */
public class TestPassword {

    public static void main(String[] args){
        String pass = "123456";
        String encodeStr = MD5Util.MD5Encode(pass,"");
        System.out.println(encodeStr);
    }
}
