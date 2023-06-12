package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication //当前为配置文件
public class CommunityApplication {

	@PostConstruct
	public void init(){
		//解决netty启动冲突问题
		//see Netty4Utils.setAvailableProcessors
		System.setProperty("es.set.netty.runtime.available.processors", "false");
	}

	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args); //扫描Bean的路径为配置类所在包以及子类下带4中注解的bean
	}

}
