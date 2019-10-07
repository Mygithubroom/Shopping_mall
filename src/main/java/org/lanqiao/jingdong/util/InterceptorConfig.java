package org.lanqiao.jingdong.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration loginRegistry=registry.addInterceptor(new CheckLogInterceptor());
        // 拦截路径
       // loginRegistry.addPathPatterns("/**");
        loginRegistry.addPathPatterns("/search.html");
        // 排除路径
//        loginRegistry.excludePathPatterns("/**");
        loginRegistry.excludePathPatterns("/login.html");
//        loginRegistry.excludePathPatterns("/index.html");
//        loginRegistry.excludePathPatterns("/jdlogin");
//        loginRegistry.excludePathPatterns("/jdHeader.html");
//        loginRegistry.excludePathPatterns("/search.html");
//        loginRegistry.excludePathPatterns("/footer.html");
//        loginRegistry.excludePathPatterns("/getNameForProduct");
//        loginRegistry.excludePathPatterns("/getNameForBrand");
//        loginRegistry.excludePathPatterns("/getNameForCateTwo");
//        loginRegistry.excludePathPatterns("/getCateTwoForCateThree");
//        loginRegistry.excludePathPatterns("/addcart.html");
//        loginRegistry.excludePathPatterns("/addCart");
//        loginRegistry.excludePathPatterns("/getInfo");
//        loginRegistry.excludePathPatterns("/getPic");
//        loginRegistry.excludePathPatterns("/cart.html");
//        loginRegistry.excludePathPatterns("/getAllCart");
//        loginRegistry.excludePathPatterns("/insetLoginId");

        // 排除资源请求
        loginRegistry.excludePathPatterns("/css/**");
        loginRegistry.excludePathPatterns("/js/**");
        loginRegistry.excludePathPatterns("/images/**");
        super.addInterceptors(registry);
    }
}
