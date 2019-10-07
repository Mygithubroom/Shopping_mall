package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.CartInfo;
import org.lanqiao.jingdong.entity.ProductInfo;
import org.lanqiao.jingdong.entity.ProductPic;

public interface CartService {
    public void insertItem(CartInfo cartInfo);
    public ProductInfo getInfo(int id);
    public ProductPic getPic(int id);
}
