package com.herocheer.face.service;

import com.herocheer.face.dao.AppAccountInfoMapper;
import com.herocheer.face.entity.AppAccountInfo;
import com.herocheer.face.entity.AppAccountInfoExample;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author chenwf
 * @date 2020/6/11
 */
@DubboService
public class AppAccountInfoServiceImpl implements AppAccountInfoService {
    @Autowired
    private AppAccountInfoMapper appAccountInfoMapper;

    @Override
    public AppAccountInfo findById(Long id) {
        return appAccountInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据appkey获取应用信息
     *
     * @param appKey
     * @return
     */
    @Override
    public AppAccountInfo findByAppId(String appKey) {
        AppAccountInfoExample appAccountInfoExample = new AppAccountInfoExample();
        appAccountInfoExample.createCriteria().andAppIdEqualTo(appKey).andStateEqualTo(1);
        List<AppAccountInfo> appAccountInfos = appAccountInfoMapper.selectByExample(appAccountInfoExample);
        if(!appAccountInfos.isEmpty()){
            return appAccountInfos.get(0);
        }
        return null;
    }
}
