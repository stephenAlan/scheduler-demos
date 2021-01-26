package com.stephen.schedulers.scheduledexecutor;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by ssc on 2021-01-26 12:38 .
 * Description: 线程池周期执行
 * 与Timer的区别是：
 * 1. timer是单线程,scheduleExecutor线程数可以控制
 * 2. timer一旦抛出异常,所有任务都会停止;而纯种线程池这种,不会影响其他的任务
 * 3. ScheduledThreadPoolExecutor可执行异步任务,用callable来执行
 */
public class ScheduledExecutorDemo {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        executorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println(new Date());
            }
        },1,2, TimeUnit.SECONDS);
    }
}
