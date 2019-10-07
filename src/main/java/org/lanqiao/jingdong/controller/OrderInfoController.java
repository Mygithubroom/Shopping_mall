package org.lanqiao.jingdong.controller;

import org.lanqiao.jingdong.entity.OrderInfo;
import org.lanqiao.jingdong.entity.ProductOrder;
import org.lanqiao.jingdong.service.OrderInfoService;
import org.lanqiao.jingdong.util.CheckLogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
public class OrderInfoController {
    @Autowired
    OrderInfoService orderInfoService;
    @Autowired
    CheckLogInterceptor checkLogInterceptor;
    @RequestMapping("/insetLoginId")
    public int insertLoginId(HttpServletRequest request,@RequestBody List<ProductOrder> productOrderList){
        OrderInfo orderInfo = new OrderInfo();
        int num=checkLogInterceptor.getLoginId(request);
        orderInfo.setLoginId(num);//用户id
        orderInfoService.insertLoginId(productOrderList,orderInfo);

        for (ProductOrder productOrder:productOrderList) {
            System.out.println(productOrder);
        }
        return orderInfo.getOrderId();
    }

    @RequestMapping("/getOrderInfo")
    public Map getOrderInfo(String orderId){
        orderInfoService.getOrderInfo(Integer.valueOf(orderId));
        return orderInfoService.getOrderInfo(1);
    }
}
