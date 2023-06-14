package com.nowcoder.community.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * ClassName: AlphaJob
 * Package: com.nowcoder.community.quartz
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/6/14 16:45
 * @Version 1.0
 */
public class AlphaJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(Thread.currentThread().getName() + ": execute a quaartz job.");
    }
}
