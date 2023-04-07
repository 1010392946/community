package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * ClassName: AlphaConfig
 * Package: com.nowcoder.community.config
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/4/6 15:03
 * @Version 1.0
 */
@Configuration  //表示当前类为配置文件
public class AlphaConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
    }
}
