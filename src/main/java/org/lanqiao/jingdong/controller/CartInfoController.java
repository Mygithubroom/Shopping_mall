package org.lanqiao.jingdong.controller;

import org.lanqiao.jingdong.entity.CartInfo;
import org.lanqiao.jingdong.service.CartInfoService;
import org.lanqiao.jingdong.util.CheckLogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CartInfoController {
    @Autowired
    CartInfoService cartInfoService;
    @Autowired
    CheckLogInterceptor checkLogInterceptor;
//    @RequestMapping("/cartinfo")
//    public CartInfo selectByPrimaryKey(Integer loginId){
////        CartInfo cartInfo = new CartInfo();
//        System.out.println(cartInfoService.selectByPrimaryKey(1));
//        return cartInfoService.selectByPrimaryKey(1);
//    }
    @RequestMapping("/getAllCart")
    public List<CartInfo> getAllCart(Integer loginId, HttpServletRequest request){
//        System.out.println(cartInfoService.getAllCart(1));
        int num=checkLogInterceptor.getLoginId(request);
        return cartInfoService.getAllCart(num);
    }
}
