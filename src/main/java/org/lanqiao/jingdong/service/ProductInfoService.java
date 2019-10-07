package org.lanqiao.jingdong.service;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.jingdong.entity.BrandInfo;
import org.lanqiao.jingdong.entity.CategoryInfo;
import org.lanqiao.jingdong.entity.ProductInfo;
import org.lanqiao.jingdong.entity.ProductVo;

import java.util.List;

public interface ProductInfoService {
    public int getNameForTotalCount(ProductVo productVo);
    public List<ProductInfo> getNameForProduct(ProductVo productVo);
    public List<BrandInfo> getNameForBrand(String productName);
    public List<CategoryInfo> getNameForCateTwo(String productName);
    public List<CategoryInfo> getCateTwoForCateThree(Integer cateTwo, String productName);
}
