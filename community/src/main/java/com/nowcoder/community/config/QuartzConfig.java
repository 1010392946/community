package com.nowcoder.community.config;

import com.nowcoder.community.quartz.AlphaJob;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

/**
 * ClassName: QuartzConfig
 * Package: com.nowcoder.community.config
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/6/14 16:47
 * @Version 1.0
 */
//配置 -》 数据库 -》 调用
@Configuration
public class QuartzConfig {

    //FactoryBean可简化bean的实例化过程：
    //通过FactoryBean封装Bean的实例化过程
    //将Factory装配到Spring容器里
    //将FactoryBean注入到其他的Bean
    //该Bean得到的是FactoryBean所管理的对象实例

    //配置JobDetail
    //@Bean
    public JobDetailFactoryBean alphaJobDetail(){
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        factoryBean.setJobClass(AlphaJob.class);
        factoryBean.setName("alphaJob");
        factoryBean.setGroup("alphaJobGroup");
        factoryBean.setDurability(true);
        factoryBean.setRequestsRecovery(true);
        return factoryBean;
    }

    //配置Trigger(simpleTriggerFactoryBean, CronTriggerFactoryBean)
    //@Bean
    public SimpleTriggerFactoryBean alphaTrigger(JobDetail alphaJobDetail){
        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        factoryBean.setJobDetail(alphaJobDetail);
        factoryBean.setName("alphaTrigger");
        factoryBean.setGroup("alphaTriggerGroup");
        factoryBean.setRepeatInterval(3000);
        factoryBean.setJobDataMap(new JobDataMap());
        return factoryBean;
    }
}
