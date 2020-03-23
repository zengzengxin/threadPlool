package com.zengxin.threadpool.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
@Component
public class Threadpool {

    @Bean
    public ThreadPoolExecutor addThreadPoolExecutor(){
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(1500);
        return new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, queue);
    }
}
