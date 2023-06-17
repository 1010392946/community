package com.nowcoder.community;

import com.nowcoder.community.service.AlphaService;
import com.nowcoder.community.service.DataService;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.concurrent.*;

/**
 * ClassName: ThreadPoolTests
 * Package: com.nowcoder.community
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/6/14 14:24
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class ThreadPoolTests {

    private static final Logger logger = LoggerFactory.getLogger(ThreadPoolTests.class);

    //JDK普通线程池
    private ExecutorService executorService = Executors.newFixedThreadPool(5);

    //JDK可执行定时任务的线程池
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

    //Spring普通线程池
    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    //Spring可执行定时任务的线程池
    @Autowired
    private ThreadPoolTaskScheduler taskScheduler;

    @Autowired
    private AlphaService alphaService;

    private void sleep(long m){
        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //JDK普通线程池
    @Test
    public void testExecutorService(){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                logger.debug("hello ExecutoeService");
            }
        };
        for (int i = 0; i < 10; i++){
            executorService.submit(task);
        }
        sleep(10000);
    }


    //JDK定时任务线程池
    @Test
    public void testScheduledExcutorService(){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                logger.debug("hello ExecutoeService");
            }
        };

        scheduledExecutorService.scheduleAtFixedRate(task, 10000, 1000, TimeUnit.MILLISECONDS);
        sleep(30000);
    }

    //spring普通线程池
    @Test
    public void testThreadPoolTaskExecutor(){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                logger.debug("hello ExecutoeService");
            }
        };
        for (int i = 0; i < 10; i++){
            taskExecutor.submit(task);
        }
        sleep(10000);
    }

    //Spring定时任务线程池
    @Test
    public void testThreadPooltaskScheduler(){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                logger.debug("hello ExecutoeService");
            }
        };

        Date startTime = new Date(System.currentTimeMillis() + 10000);
        taskScheduler.scheduleAtFixedRate(task, startTime, 1000);
        sleep(30000);
    }

    //spring普通线程池简化
    @Test
    public void testThreadPoolTaskExecutorSimple(){
        for (int i = 0; i < 10; i++){
            alphaService.execute1();
        }

        sleep(10000);
    }

    //spring定时线程池简化
    @Test
    public void testThreadPoolTaskSchedulerSimple(){
        sleep(30000);
    }

}