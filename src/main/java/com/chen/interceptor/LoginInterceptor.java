package com.chen.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    //AOP面向切面编程应用，拦截器，横切法
    //前置处理，拦截器作出拦截动作的主要部分
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==========拦截器处理开始==========");
        HttpSession session = request.getSession();
        if (session.getAttribute("msg")!=null){
            return true;
        }

        //未登录用户禁止进入后台
        response.sendRedirect("/index.jsp");
        return false;
    }

    //以下两方法通常用于日志
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HttpSession session = request.getSession();
        System.out.println("==========拦截器处理之后==========");
        System.out.println("sessionInfo: "+session.getAttribute("msg"));
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("=================================");
    }
}
