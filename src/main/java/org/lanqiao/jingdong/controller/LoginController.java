package org.lanqiao.jingdong.controller;

import com.mysql.jdbc.StringUtils;
import org.lanqiao.jingdong.entity.LoginInf;
import org.lanqiao.jingdong.service.LogininfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.lanqiao.jingdong.util.CheckLogInterceptor;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    LogininfService logininfService;
    @Autowired
    CheckLogInterceptor checkLogInterceptor;
    @RequestMapping("jdlogin")
    public boolean isCall(LoginInf loginInf,HttpServletResponse response){
//        boolean tem=logininfService.checkuser(loginInf);
//        session.setAttribute("loginInf",loginInf);

        return logininfService.checkuser(loginInf,response);
    }
//@RequestMapping("/sessionTest")
//    public int sessionTest(HttpSession session){
//        if(session.getAttribute("loginInf")!=null)
//            System.out.println(session.getAttribute("loginInf"));
//        return 0;
//    }
//    @RequestMapping("setCookielogin")
//    public String setCookie(HttpServletResponse response,LoginInf loginInf,String callback){
//        Cookie cookie=new Cookie("acount","same");
//        cookie.setPath("/");
//        response.addCookie(cookie);
//        if(StringUtils.isNullOrEmpty(callback)){
//            return callback+"('success')";
//        }
//        return "success";
//    }
//    @RequestMapping("getCookie")
//    public String getCookie(HttpServletRequest request,String callback){
//        Cookie[] cookies=request.getCookies();
//        int num=checkLogInterceptor.getLoginId(request);
//        if (cookies !=null && cookies.length>0){
//            for(Cookie cookie:cookies){
//                System.out.println("name:"+cookie.getName()+"------value:"+cookie.getValue()+"***"+num);
//            }
//        }
//        if(StringUtils.isNullOrEmpty(callback)){
//            return callback+"('success')";
//        }
//        return "success";
//    }
}
