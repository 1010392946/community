package com.nowcoder.community;

import com.nowcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * ClassName: TransactionTests
 * Package: com.nowcoder.community
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/5/30 19:53
 * @Version 1.0
 */
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TransactionTests {
    @Autowired
    private AlphaService alphaService;

    @Test
    public void testSavel(){
        Object obj = alphaService.save2();
        System.out.println(obj);
    }
}
