package com.vcredit.common.interceptor;

import com.vcredit.common.constant.SysConstant;
import com.vcredit.user.entity.ManageUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by zhangzhizhong on 2017/4/19.
 */

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        if (request.getServletPath().endsWith("index") || request.getServletPath().endsWith("login")) {
            return true;
        }

        HttpSession session = request.getSession();
        ManageUser user = (ManageUser) session.getAttribute(SysConstant.SESSION_USER_INFO);
        if (user == null) {
            response.sendRedirect(request.getContextPath() + "/home/index");
            return false;
        }
        return true;


    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
