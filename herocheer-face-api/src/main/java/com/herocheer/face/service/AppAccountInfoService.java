package com.herocheer.face.service;

import com.herocheer.face.entity.AppAccountInfo;

/**
 * @author chenwf
 * @date 2020/6/11
 */
public interface AppAccountInfoService {

    AppAccountInfo findById(Long id);

    /**
     * 根据appkey获取应用信息
     * @param appKey
     * @return
     */
    AppAccountInfo findByAppId(String appKey);
}
