package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * ClassName: AlphaDaoMyBatise
 * Package: com.nowcoder.community.dao
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/4/6 10:37
 * @Version 1.0
 */
@Repository //数据库相关
@Primary //在多个可选择的bean时，设定当前类的优点
public class AlphaDaoMyBatis implements  AlphaDao {
    @Override
    public String select() {
        return "MyBatis";
    }
}
