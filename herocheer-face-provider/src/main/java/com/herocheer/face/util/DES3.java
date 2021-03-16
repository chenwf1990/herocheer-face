package com.herocheer.face.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;


public class DES3 {
    /**
     * 根据参数生成Key;
     *
     * @param strKey
     */
    private Key getKey(String strKey) {
        Key key = null;
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
            secureRandom.setSeed(strKey.getBytes("UTF-8"));
            keyGenerator.init(secureRandom);
            key = keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return key;
    }

    /**
     * 获得一次3DES加密后的密文
     *
     * @param
     * @return strMi
     */
    public String getEncString(String strMing, String strKey) {
        byte[] byteMi = null;
        byte[] byteMing = null;
        String strMi = "";
        Key key = getKey(strKey);
        BASE64Encoder encoder = new BASE64Encoder();
        try {
            byteMing = strMing.getBytes("utf-8");
            byteMi = getEncCode(byteMing, key);
            strMi = encoder.encode(byteMi);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            encoder = null;
            byteMi = null;
            byteMing = null;
        }
        return strMi;
    }

    /**
     * 获得两次3DES加密后的密文
     *
     * @param
     * @return strMi
     */
    public String getTwiceEncString(String strMing, String strKey) {
        return getEncString(getEncString(strMing, strKey), strKey);
    }

    /**
     * 获得一次3DES解密后的明文
     *
     * @param
     * @return strMing
     */
    public String getDecString(String strMi, String strKey) {
        BASE64Decoder base64Decoder = new BASE64Decoder();
        byte[] byteMing = null;
        byte[] byteMi = null;
        String strMing = "";
        Key key = getKey(strKey);
        try {
            byteMi = base64Decoder.decodeBuffer(strMi);
            byteMing = getDecCode(byteMi, key);
            strMing = new String(byteMing, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            base64Decoder = null;
            byteMing = null;
            byteMi = null;
        }
        return strMing;
    }

    /**
     * 获得两次3DES解密后的明文
     *
     * @param
     * @return strMing
     */
    public String getTwiceDecString(String strMi, String strKey) {
        return getDecString(getDecString(strMi, strKey), strKey);
    }

    /**
     * 获得一次3DES加密后的密文
     *
     * @param byts
     * @return
     */
    private byte[] getEncCode(byte[] byts, Key key) {
        byte[] byteFina = null;
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byteFina = cipher.doFinal(byts);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cipher = null;
        }
        return byteFina;
    }

    /**
     * 获得一次3DES解密后的明文
     *
     * @param bytd
     * @return
     */
    private byte[] getDecCode(byte[] bytd, Key key) {
        byte[] byteFina = null;
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byteFina = cipher.doFinal(bytd);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cipher = null;
        }
        return byteFina;
    }

    public static String getRandomKey(){
        return UUID.randomUUID().toString().replace("-","");
    }

    public static void main(String[] args) {
        DES3 d = new DES3();
        String appKey = "350dd6f586f544e9a4a94ca7491e320c";
        String content = "350521199007031038";
        System.out.println("秘钥："+appKey);
        System.out.println("加密前："+content);
        String a = d.getEncString(content, appKey);
        System.out.println("加密后："+a);
        String b = d.getDecString(a, appKey);
        System.out.println("解密后："+b);
    }
}
