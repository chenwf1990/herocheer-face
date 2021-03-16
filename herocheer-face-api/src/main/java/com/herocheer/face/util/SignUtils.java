package com.herocheer.face.util;

import java.security.MessageDigest;
import java.util.*;

/**
 * @author chenwf
 * @date 2020/6/15
 */
public class SignUtils {

    public static String MD5Encrypt(Map<String,Object> dataMap,String secret) {
        String content = ASCIISort(dataMap,secret);
        String md5 = getMD5(content);
        return md5;
    }

    public static String getMD5(String content){

        MessageDigest md5 = null;

        try{

            md5 = MessageDigest.getInstance("MD5");

        }catch (Exception e){

            System.out.println(e.toString());
            e.printStackTrace();

            return "";
        }

        char[] charArray = content.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];

        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();

        for (int i = 0; i < md5Bytes.length; i++){

            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }

        return hexValue.toString().substring(8,24);

    }


    public static String ASCIISort(Map<String, Object> dataMap, String secret){
        String conetnt = "";
        if(dataMap.containsKey("sign")){
            dataMap.remove("sign");
        }
        Collection<String> keyset= dataMap.keySet();
        List list=new ArrayList(keyset);
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            conetnt += list.get(i)+"="+dataMap.get(list.get(i)) + "&";
        }
        conetnt += "secret=" + secret;
        System.out.println("输出："+conetnt);
        return conetnt;
    }
}
