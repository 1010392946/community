package com.nowcoder.community.service;

import com.nowcoder.community.dao.CommentMapper;
import com.nowcoder.community.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.pattern.PathPattern;

import java.util.List;

/**
 * ClassName: CommentService
 * Package: com.nowcoder.community.service
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/5/31 13:08
 * @Version 1.0
 */
@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;
    public List<Comment> findCommentsByEntity(int entityType, int entityId, int offset, int limit){
        return commentMapper.selectCommentsByEntity(entityType, entityId, offset, limit);
    }

    public int findCommentCount(int entityType, int entityId){
        return commentMapper.selectCountByEntity(entityType, entityId);
    }
}
