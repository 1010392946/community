package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ClassName: ThreadPoolConfig
 * Package: com.nowcoder.community.config
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/6/14 15:19
 * @Version 1.0
 */
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}
