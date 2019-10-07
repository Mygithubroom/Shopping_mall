package org.lanqiao.jingdong.controller;

import org.lanqiao.jingdong.entity.CartInfo;
import org.lanqiao.jingdong.entity.ProductInfo;
import org.lanqiao.jingdong.entity.ProductPic;
import org.lanqiao.jingdong.service.CartService;
import org.lanqiao.jingdong.util.CheckLogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CartController {
    @Autowired
    CartService cartService;
    @Autowired
    CheckLogInterceptor checkLogInterceptor;
    @RequestMapping("/addCart")
    public boolean insertCart(CartInfo cartInfo, HttpServletRequest request){
        cartInfo.setLoginId(checkLogInterceptor.getLoginId(request));
        cartService.insertItem(cartInfo);
        return true;
    }
    @RequestMapping("/getInfo")
    public ProductInfo getInfo(int id){
        ProductInfo productInfo = cartService.getInfo(id);
        System.out.println(productInfo);
        return productInfo;
    }
    @RequestMapping("/getPic")
    public ProductPic getPic(int id){
        System.out.println(cartService.getPic(id));
        return cartService.getPic(id);
    }
}
