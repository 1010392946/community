package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: DiscussPostMapper
 * Package: com.nowcoder.community.dao
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/4/14 12:59
 * @Version 1.0
 */
@Mapper  //mabatis标签，避免了xml文件的繁琐配置
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit, int orderMode);

    //@param 用于给参数取别名
    //@Param注解用于给参数取别名，当这个方法中只有一个参数时并且这个参数在mapper.xml文件中被使用在<if>标签中时，就必须要使用@Param注解来给这个参数取个别名
    int selectDiscussPostRows(@Param("userId") int useId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id, int commentCount);

    int updateType(int id, int type);

    int updateStatus(int id, int status);

    int updateScore(int id, double score);
}
