package com.felix.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * @author : felix
 * @createTime : 2017/10/25.
 */
@Component
public class TaskTest {

    @Scheduled(cron = "0/5 * * * * ? ")
    public void test1() {
        System.out.println("当前时间：" + LocalTime.now() + "------test1被调度");
    }

    @Scheduled(fixedRate = 5000)
    public void test2() {
        System.out.println("当前时间：" + LocalTime.now() + "------test2被调度");
    }

    @Scheduled(fixedDelay = 5000)
    public void test3() {
        System.out.println("当前时间：" + LocalTime.now() + "------test3被调度");
    }

    @Scheduled(initialDelay = 2000, fixedDelay = 5000)
    public void test4() {
        System.out.println("当前时间：" + LocalTime.now() + "------test4被调度");
    }

    @Schedules(value = {@Scheduled(cron = "0 04 23 * * ? "), @Scheduled(cron = "0 05 23 * * ? ")})
//    @Scheduled(cron = "0 01 23 * * ? ")
//    @Scheduled(cron = "0 02 23 * * ? ")
    public void test5() {
        System.out.println("当前时间：" + LocalTime.now() + "------test5被调度");
    }
}
