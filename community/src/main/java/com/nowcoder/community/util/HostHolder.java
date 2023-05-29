package com.nowcoder.community.util;

import com.nowcoder.community.entity.Page;
import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * ClassName: HostHolder
 * Package: com.nowcoder.community.util
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/5/25 16:06
 * @Version 1.0
 */
//持有用户信息，用于代替session对象
@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user){
        users.set(user);
    }

    public User getUser(){
        return users.get();
    }

    public void clear(){
        users.remove();
    }
}
