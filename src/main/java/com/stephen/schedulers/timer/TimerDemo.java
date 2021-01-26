package com.stephen.schedulers.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ssc on 2021-01-26 12:32 .
 * Description: jdk自带的timer
 * 每个timer对应一个线程,可以同时启动多个timer执行任务
 */
public class TimerDemo {

    public static void main(String[] args) {
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();

        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println( "timer1 "+ new Date());
            }
        },1000,2000); // 1秒后开始调度,每2秒执行一次

        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer2 " + new Date());
            }
        },1000,3000); // 1秒后开始调度,每3秒执行一次
    }
}
