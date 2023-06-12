package com.nowcoder.community.controller.interceptor;

import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.MessageService;
import com.nowcoder.community.util.HostHolder;
import org.apache.catalina.Host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName: MessageIntecepter
 * Package: com.nowcoder.community.controller.interceptor
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/6/7 21:30
 * @Version 1.0
 */
@Component
public class MessageIntecepter implements HandlerInterceptor {

    @Autowired
    private HostHolder hostHolder;

    @Autowired
    private MessageService messageService;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       User user = hostHolder.getUser();
       if (user != null && modelAndView != null){
           int letterUnreadCount = messageService.findLetterUnreadCount(user.getId(), null);
           int noticeUnreadount = messageService.findNoticeUnreadCount(user.getId(), null);
           modelAndView.addObject("allUnreadCount", letterUnreadCount + noticeUnreadount);
       }


       HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
