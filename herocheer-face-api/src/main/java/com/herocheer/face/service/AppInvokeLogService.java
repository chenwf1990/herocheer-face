package com.herocheer.face.service;

/**
 * @author chenwf
 * @date 2020/6/11
 */
public interface AppInvokeLogService {
    /**
     * 添加应用调用日志
     */
    void addLog(Long appAcctId, Long interfaceAcctId, String reqInfo, String msg);
}
