package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.OrderInfo;
import org.lanqiao.jingdong.entity.ProductOrder;

import java.util.List;
import java.util.Map;

public interface OrderInfoService {
    public int insertLoginId(List<ProductOrder> productOrderList, OrderInfo orderInfo);
    public Map getOrderInfo(int orderId);
}
