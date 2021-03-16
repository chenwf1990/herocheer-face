package com.herocheer.face.mq;

import org.springframework.stereotype.Component;

/**
 *
 * @author chenwf
 * @date 2020/6/13
 */
@Component
public class AppInterfaceProcessor {
//    @Autowired
//    private AppInvokeLogService appInvokeLogService;
//
//    @RabbitListener(bindings = {
//            @QueueBinding(value = @Queue(value = RabbbitKey.QUEUE), exchange = @Exchange(value = RabbbitKey.EXCHANGE, autoDelete = "true"),
//                    key = RabbbitKey.RUTE_KEY)
//    })
//    public void processor(String jsonMsg, @Header(AmqpHeaders.CONSUMER_QUEUE) String queue) {
//        //调用成功插入一条成功日志 interface_log
//        try {
//            AppInterfaceVo interfaceVo = JSONObject.parseObject(jsonMsg,AppInterfaceVo.class);
//            appInvokeLogService.addLog(interfaceVo.getAppAcctId(),interfaceVo.getInterfaceAcctId(),interfaceVo.getReqInfo());
//        }catch (Exception e){
//            return;
//        }
//    }
}