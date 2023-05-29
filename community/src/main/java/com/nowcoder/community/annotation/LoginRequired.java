package com.nowcoder.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: LoginRequired
 * Package: com.nowcoder.community.annotation
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/5/27 15:17
 * @Version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {
}
