package com.nowcoder.community;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class) //使当前的测试类以所选类的配置运行
class CommunityApplicationTests implements ApplicationContextAware {  //通过实现接口ApplicationContextAware来获取Spring容器
	@Test
	void contextLoads() {
	}

	private  ApplicationContext applicationContext; //用于记录Spring容器
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext =applicationContext;
	}

	@Test
	public void testApplicationContext(){
		System.out.println(applicationContext);


		AlphaDao alphaDao = applicationContext.getBean(AlphaDao.class); //AlphaDao.class是代表类的字面量，通过applicationContext.getBean()，可以根据字面量信息，也就是类的相关信息来创建具体实例
		//优点：减少代码的耦合，避免了在代码中使用字符串来指定bean的名称，不用频繁更改AlphaDao接口的实现类。
		System.out.println(alphaDao.select());

		alphaDao = applicationContext.getBean("alphaH", AlphaDao.class);
		System.out.println(alphaDao.select());
	}

	@Test
	public void testBeanManagement(){
		AlphaService alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);

		alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
	}

	@Test
	public void testBeanConfig(){
		SimpleDateFormat simpleDateFormat =
				applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format((new Date())));
	}

	@Autowired  //依赖注入
	@Qualifier("alphaH") //多个Bean时进行指定
	private AlphaDao alphaDao;

	@Test
	public void testDI(){
		System.out.println(alphaDao);
	}
}
