package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.CartInfo;
import org.lanqiao.jingdong.mapper.CartInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartInfoServiceImpl implements CartInfoService {
    @Autowired
    CartInfoMapper cartInfoMapper;
//    @Override
//    public CartInfo selectByPrimaryKey(Integer lodinId) {
//        return  cartInfoMapper.selectByPrimaryKey(lodinId);
//    }

    @Override
    public List<CartInfo> getAllCart(Integer loginId) {
        return cartInfoMapper.getAllCart(loginId);
    }
}
