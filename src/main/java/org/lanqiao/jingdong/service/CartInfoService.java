package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.CartInfo;

import java.util.List;


public interface CartInfoService {
//    public CartInfo selectByPrimaryKey(Integer LoginId);

    public List<CartInfo> getAllCart(Integer loginId);
}
