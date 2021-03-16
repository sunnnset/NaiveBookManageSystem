package com.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userName = (String) request.getSession().getAttribute("userLoginInfo");
        String authString = (String) request.getSession().getAttribute("authRandString");
        System.out.println("loginInterceptor");
        System.out.println("username:"+userName);
        String URI = request.getRequestURI();

        if (URI.contains("login") | URI.contains("error")){
            System.out.println("登录页面，放行");
            return true;
        }

        if ("admin".equals(userName) && "348t897ADKHVSHf3hsuf2".equals(authString)){
            System.out.println("session中存在admin登录信息，放行");
            return true;
        }

        else{
            response.sendRedirect("/SSMTest/login");
            System.out.println("拦截请求");
            return false;
        }

    }
}
