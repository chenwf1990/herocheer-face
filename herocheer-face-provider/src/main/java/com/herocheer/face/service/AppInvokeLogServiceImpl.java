package com.herocheer.face.service;

import com.herocheer.face.dao.AppInvokeLogMapper;
import com.herocheer.face.entity.AppInvokeLog;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author chenwf
 * @date 2020/6/11
 */
@DubboService
public class AppInvokeLogServiceImpl implements AppInvokeLogService {
    @Autowired
    private AppInvokeLogMapper appInvokeLogMapper;

    /**
     * 添加应用调用日志
     */
    @Override
    public void addLog(Long appAcctId, Long interfaceAcctId,String reqInfo, String msg) {
        AppInvokeLog log = new AppInvokeLog();
        log.setAppAcctId(appAcctId);
        log.setInterfaceAcctId(interfaceAcctId);
        log.setReqInfo(reqInfo);
        log.setMsg(msg);
        log.setCreatedTime(new Date().getTime());
        appInvokeLogMapper.insertSelective(log);
    }
}
