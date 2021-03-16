package com.herocheer.face.service;

import com.herocheer.face.vo.AppInterfaceVo;

import java.util.List;

/**
 * @author chenwf
 * @date 2020/6/11
 */
public interface AppInterfaceInfoService {
    /**
     * 根据appId获取应用可用渠道信息
     * @param appAccId
     * @return
     */
    List<AppInterfaceVo> getAppInterfaceInfo(Long appAccId);
}
