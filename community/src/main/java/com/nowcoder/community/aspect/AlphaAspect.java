package com.nowcoder.community.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * ClassName: AlphaAspect
 * Package: com.nowcoder.community.aspect
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/6/3 15:22
 * @Version 1.0
 */

//@Component
//@Aspect
public class AlphaAspect {

    @Pointcut("execution(* com.nowcoder.community.service.*.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
        System.out.println("before");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning("pointcut()")
    public void afterRetuning(){
        System.out.println("afterRetuning");
    }

    @AfterThrowing("pointcut()")
    public void afterThroeing(){
        System.out.println("afterThrowing");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("around befor");
        Object obj = joinPoint.proceed();
        System.out.println("around after");
        return obj;
    }

}
