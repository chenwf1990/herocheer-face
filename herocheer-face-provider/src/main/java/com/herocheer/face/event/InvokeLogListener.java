package com.herocheer.face.event;

import com.herocheer.face.service.AppInvokeLogService;
import com.herocheer.face.vo.AppInterfaceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author chenwf
 * @desc
 * @date 2021/6/15
 * @company 厦门熙重电子科技有限公司
 */
@Slf4j
@Component
public class InvokeLogListener implements ApplicationListener<InvokeLogEvent> {
    @Autowired
    private AppInvokeLogService appInvokeLogService;

    @Async("taskExecutor")
    @Override
    public void onApplicationEvent(InvokeLogEvent invokeLogEvent) {
        try {
            AppInterfaceVo interfaceVo = invokeLogEvent.getAppInterfaceVo();
            appInvokeLogService.addLog(interfaceVo.getAppAcctId(),interfaceVo.getInterfaceAcctId(),interfaceVo.getReqInfo(),interfaceVo.getMsg());
        } catch (Exception e) {
            log.error("添加调用日志失败：{}",e.getMessage(),e);
        }
    }
}
