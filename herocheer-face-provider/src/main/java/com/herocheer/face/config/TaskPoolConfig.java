package com.herocheer.face.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author chenwf
 * @desc
 * @date 2021/6/15
 * @company 厦门熙重电子科技有限公司
 */
@Configuration
public class TaskPoolConfig {
    /**
     * 根据cpu的数量动态的配置核心线程数和最大线程数
     */
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();

    @Bean("taskExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(CPU_COUNT + 1);//核心线程数
        executor.setMaxPoolSize(CPU_COUNT * 2 + 1);//线程池所容纳最大线程数
        executor.setQueueCapacity(200);//用来缓冲执行任务的队列
        executor.setKeepAliveSeconds(60);//非核心线程闲置时间超时时长
        executor.setThreadNamePrefix("spring-task-executor-thread-");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return executor;
    }
}
