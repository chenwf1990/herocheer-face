package com.herocheer.face.event;

import com.herocheer.face.vo.AppInterfaceVo;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;

/**
 * @author chenwf
 * @desc
 * @date 2021/6/15
 * @company 厦门熙重电子科技有限公司
 */
@Slf4j
@Data
public class InvokeLogEvent extends ApplicationEvent {
    private AppInterfaceVo appInterfaceVo;

    public InvokeLogEvent(AppInterfaceVo appInterfaceVo) {
        super(appInterfaceVo);
        this.appInterfaceVo = appInterfaceVo;
    }
}
