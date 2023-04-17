package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLOutput;

/**
 * ClassName: AlphaService
 * Package: com.nowcoder.community.service
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/4/6 11:18
 * @Version 1.0
 */
@Service //服务相关
//@Scope("prototype")  //可以获取多个实例对象
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("构造");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }

//    @PreDestroy
//    public void destory(){
//        System.out.println("destory");
//    }

//    public String find(){
//        return alphaDao.select();
//    }
}
