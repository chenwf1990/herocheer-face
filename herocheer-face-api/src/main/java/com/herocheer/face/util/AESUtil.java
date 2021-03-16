package com.herocheer.face.util;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.StrUtil;
import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.MessageDigest;

public class AESUtil {
    private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";
    public static final String decryptKey = "b7ec5e74c2dcee5f";

    /**
     * 将byte[]转为各种进制的字符串
     * @param bytes byte[]
     * @param radix 可以转换进制的范围，从Character.MIN_RADIX到Character.MAX_RADIX，超出范围后变为10进制
     * @return 转换后的字符串
     */
    public static String binary(byte[] bytes, int radix){
        return new BigInteger(1, bytes).toString(radix);// 这里的1代表正数
    }

    /**
     * base 64 encode
     * @param bytes 待编码的byte[]
     * @return 编码后的base 64 code
     */
    public static String base64Encode(byte[] bytes){
        return Base64.encode(bytes);
    }

    /**
     * base 64 decode
     * @param base64Code 待解码的base 64 code
     * @return 解码后的byte[]
     * @throws Exception
     */
    public static byte[] base64Decode(String base64Code) throws Exception{
        return StrUtil.isEmpty(base64Code) ? null : new BASE64Decoder().decodeBuffer(base64Code);
    }


    /**
     * AES加密
     * @param content 待加密的内容
     * @param encryptKey 加密密钥
     * @return 加密后的byte[]
     * @throws Exception
     */
    public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"));

        return cipher.doFinal(content.getBytes("utf-8"));
    }


    /**
     * AES加密为base 64 code
     * @param content 待加密的内容
     * @param encryptKey 加密密钥
     * @return 加密后的base 64 code
     * @throws Exception
     */
    public static String aesEncrypt(String content, String encryptKey){
        try {
            String k = getMD5(encryptKey);
            System.out.println(k);
            String encrypt = base64Encode(aesEncryptToBytes(content, k));
            return encrypt;
        } catch (Exception e) {
            throw new CommonException(MessageCodeLocale.SYATEM_ERROR,"系统异常");
        }
    }

    /**
     * AES解密
     * @param encryptBytes 待解密的byte[]
     * @param decryptKey 解密密钥
     * @return 解密后的String
     * @throws Exception
     */
    public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);

        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), "AES"));
        byte[] decryptBytes = cipher.doFinal(encryptBytes);
        return new String(decryptBytes);
    }


    /**
     * 将base 64 code AES解密
     * @param encryptStr 待解密的base 64 code
     * @param decryptKey 解密密钥
     * @return 解密后的string
     * @throws Exception
     */
    public static String aesDecrypt(String encryptStr, String decryptKey){
        try {
            String k = getMD5(decryptKey);
            return StrUtil.isEmpty(encryptStr) ? null : aesDecryptByBytes(base64Decode(encryptStr), k);
        }catch (Exception e){
            throw new CommonException(MessageCodeLocale.SYATEM_ERROR,"系统异常");
        }
    }


    public static String getMD5(String inStr){

        MessageDigest md5 = null;

        try{

            md5 = MessageDigest.getInstance("MD5");

        }catch (Exception e){

            System.out.println(e.toString());
            e.printStackTrace();

            return "";
        }

        char[] charArray = inStr.toCharArray();
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

    public static void main(String[] args) throws Exception {
        String str = "陈伟峰";
        String key = "b7ec5e74c2dcee5f";
        String enncryStr = aesEncrypt(str,key);
        System.out.println("原文："+str);
        System.out.println("密文："+enncryStr);
        String decryStr = aesDecrypt(enncryStr,key);
        System.out.println("解密："+decryStr);
    }
}
