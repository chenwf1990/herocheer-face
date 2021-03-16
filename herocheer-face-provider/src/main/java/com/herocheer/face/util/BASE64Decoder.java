package com.herocheer.face.util;

import cn.hutool.core.codec.Base64;

/**
 * @author chenwf
 * @date 2020/6/17
 */
public class BASE64Decoder {
    public static byte[] decodeBuffer(String strMi) {
        return Base64.decode(strMi);
    }
}
