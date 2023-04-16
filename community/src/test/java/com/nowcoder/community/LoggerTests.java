package com.nowcoder.community;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * ClassName: LoggerTests
 * Package: com.nowcoder.community
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/4/16 16:43
 * @Version 1.0
 */
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class) //使当前的测试类以所选类的配置运行
public class LoggerTests {
    private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testLogger(){
        System.out.println(logger.getName());

        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }
}
