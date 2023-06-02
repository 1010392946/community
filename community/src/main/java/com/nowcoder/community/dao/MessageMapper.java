package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: MessageMapper
 * Package: com.nowcoder.community.dao
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/6/1 15:18
 * @Version 1.0
 */
@Mapper
public interface MessageMapper {
    //查询当前用户的会话列表,针对每个会话返回一个最新的私信
    List<Message> selectConversations(int userId, int offset, int limit);

    //查询当前用户的会话数量,
    int selectConversationCount(int userId);

    //查询某个会话所包含的私信列表
    List<Message> selectLetters(String conversationId, int offset, int limit);

    //查询某个会话所包含的私信的数量
    int selectLetterCount(String conversationId);

    //查询未读私信的数量
    int selectLetterUnreadCount(int userId, String conversationId);

    //新增消息
    int insertMessage(Message message);

    //修改消息的状态
    int updateStatus(List<Integer> ids, int status);

}
