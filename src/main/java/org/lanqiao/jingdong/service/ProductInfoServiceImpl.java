package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.BrandInfo;
import org.lanqiao.jingdong.entity.CategoryInfo;
import org.lanqiao.jingdong.entity.ProductInfo;
import org.lanqiao.jingdong.entity.ProductVo;
import org.lanqiao.jingdong.mapper.ProductInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    ProductInfoMapper productInfoMapper;

    @Override
    public int getNameForTotalCount(ProductVo productVo) {
        return productInfoMapper.selectByNameForTotalCount(productVo.getBrandId(), productVo.getCategoryId(), productVo.getProductName());
    }

    @Override
    public List<ProductInfo> getNameForProduct(ProductVo productVo) {
        int pageBegin = (productVo.getPageNum() - 1) * productVo.getPageSize();
        List<ProductInfo> productInfoList = productInfoMapper.selectByNameForProduct(productVo.getBrandId(), productVo.getCategoryId(),productVo.getProductName(), pageBegin, productVo.getPageSize());
//        System.out.println(productInfoList);
        return productInfoList;
    }
    @Override
    public List<BrandInfo> getNameForBrand(String productName) {
        List<BrandInfo> brandInfoList = productInfoMapper.selectByNameForBrand(productName);
        return brandInfoList;
    }

    @Override
    public List<CategoryInfo> getNameForCateTwo(String productName) {
        return productInfoMapper.selectByNameForCateTwo(productName);
    }

    @Override
    public List<CategoryInfo> getCateTwoForCateThree(Integer cateTwo, String productName) {
        return productInfoMapper.selectByCateTwoForCateThree(cateTwo, productName);
    }
}
