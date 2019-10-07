package org.lanqiao.jingdong.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class CheckLogInterceptor implements HandlerInterceptor {
    long start =System.currentTimeMillis();
    int id =0;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies=request.getCookies();
        if(cookies !=null && cookies.length>0){
            for (Cookie cookie:cookies
                 ) {
                if(cookie.getName().equals("loginId")){
                    return true;
                }
            }
        }
        response.sendRedirect("/login.html");
        return false;
    }
    public int getLoginId(HttpServletRequest request){
        Cookie[] cookies=request.getCookies();
        if(cookies !=null && cookies.length>0){
            for (Cookie cookie:cookies
            ) {
                if(cookie.getName().equals("loginId")){
                    id=Integer.valueOf(cookie.getValue());
                    return id;
                }
            }
        }
        return id;
    }

}
