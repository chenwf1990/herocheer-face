package com.herocheer.face.service;

import com.herocheer.face.dao.AppInterfaceInfoMapper;
import com.herocheer.face.vo.AppInterfaceVo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author chenwf
 * @date 2020/6/11
 */
@DubboService
public class AppInterfaceInfoServiceImpl implements AppInterfaceInfoService {

    @Autowired
    private AppInterfaceInfoMapper appInterfaceInfoMapper;

    /**
     * 根据appKey获取应用可用渠道信息
     *
     * @param appAccId
     * @return
     */
    @Override
    public List<AppInterfaceVo> getAppInterfaceInfo(Long appAccId) {
        return this.appInterfaceInfoMapper.getAppInterfaceInfo(appAccId);
    }
}
