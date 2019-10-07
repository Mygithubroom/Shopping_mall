package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.CartInfo;
import org.lanqiao.jingdong.entity.ProductInfo;
import org.lanqiao.jingdong.entity.ProductPic;
import org.lanqiao.jingdong.mapper.CartInfoMapper;
import org.lanqiao.jingdong.mapper.ProductInfoMapper;
import org.lanqiao.jingdong.mapper.ProductPicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    CartInfoMapper cartInfoMapper;
    @Autowired
    ProductInfoMapper productInfoMapper;
    @Autowired
    ProductPicMapper productPicMapper;

    @Override
    public void insertItem(CartInfo cartInfo) {
        cartInfoMapper.insertSelective(cartInfo);
    }

    @Override
    public ProductInfo getInfo(int id) {
       return productInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public ProductPic getPic(int id) {
        return productPicMapper.selectByPrimaryKey(id);
    }
}
