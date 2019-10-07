package org.lanqiao.jingdong.service;


import org.lanqiao.jingdong.entity.CustomerInf;
import org.lanqiao.jingdong.entity.OrderInfo;
import org.lanqiao.jingdong.entity.ProductOrder;
import org.lanqiao.jingdong.mapper.CustomerInfMapper;
import org.lanqiao.jingdong.mapper.OrderInfoMapper;
import org.lanqiao.jingdong.mapper.ProductOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    OrderInfoMapper orderInfoMapper;
    @Autowired
    ProductOrderMapper productOrderMapper;
    @Autowired
    CustomerInfMapper customerInfMapper;

    @Override
    @Transactional
    public int insertLoginId(List<ProductOrder> productOrderList,OrderInfo orderInfo) {
//        OrderInfo orderInfo = new OrderInfo();
        orderInfoMapper.insertLoginId(orderInfo);
        for (ProductOrder productOrder: productOrderList) {
            productOrder.setOrderId(orderInfo.getOrderId());
            productOrderMapper.insertSelective(productOrder);



            System.out.println("我是服务器"+productOrder.getOrderId());
            System.out.println(productOrder.getOrderId()+"服务器");
        }
//        System.out.println("我是服务器"+productOrder.getOrderId());
//        System.out.println(productOrder.getOrderId()+"服务器");
//        for (ProductOrder oi:productOrderLi){
//            oi.setOrderId(orderInfo.getOrderId());
//            productOrderMapper.insertSelective(oi);
//        }
        return 0;
    }

    public Map getOrderInfo(int orderId){
        OrderInfo orderInfo = orderInfoMapper.getOrderInfo(orderId);
        CustomerInf customerInf = customerInfMapper.selectByLoginId(orderInfo.getLoginId());
        double total = 0;
        int allNum = 0;
        for (ProductOrder productOrder: orderInfo.getProductOrders()) {
            total = total + productOrder.getProductCount().doubleValue() * productOrder.getProductInfo().getPrice().doubleValue();
            allNum += productOrder.getProductCount().doubleValue();
        }
        Map OrderInfos = new HashMap();
        OrderInfos.put("orderInfo",orderInfo);
        OrderInfos.put("customerInf",customerInf);
        OrderInfos.put("total",total);
        OrderInfos.put("allNum",allNum);
        return OrderInfos;
    }
}
