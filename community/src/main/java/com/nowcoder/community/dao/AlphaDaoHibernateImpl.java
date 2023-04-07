package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: AlphaDaoHibernatelmpl
 * Package: com.nowcoder.community.dao
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/4/6 9:58
 * @Version 1.0
 */
@Repository("alphaH") //新的类名
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
