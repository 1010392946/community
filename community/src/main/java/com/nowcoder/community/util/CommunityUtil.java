package com.nowcoder.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

/**
 * ClassName: Community
 * Package: com.nowcoder.community.util
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/5/22 13:33
 * @Version 1.0
 */
public class CommunityUtil {

    //激活码，随机字符串
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    //MD5加密
    public static String md5(String key){
        if(StringUtils.isBlank(key)){
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }
}
