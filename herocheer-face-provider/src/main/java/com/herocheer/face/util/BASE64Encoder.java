package com.herocheer.face.util;

import cn.hutool.core.codec.Base64;

/**
 * @author chenwf
 * @date 2020/6/17
 */
public class BASE64Encoder {
    public static String encode(byte[] byteMi) {
        return Base64.encode(byteMi);
    }
}
