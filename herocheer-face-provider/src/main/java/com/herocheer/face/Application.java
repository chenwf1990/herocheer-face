package com.herocheer.face;

import com.alibaba.dubbo.config.annotation.Service;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author chenwf
 * @date 2020/6/11
 */

@EnableDubbo
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.herocheer"})
@MapperScan(basePackages = {"com.herocheer.face.dao"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
