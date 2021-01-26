package com.stephen.schedulers;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ssc on 2021-01-26 12:32 .
 * Description:
 */
public class TimerDemo {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        },1000,2000); // 1秒后开始调度,每2秒执行一次
    }
}
