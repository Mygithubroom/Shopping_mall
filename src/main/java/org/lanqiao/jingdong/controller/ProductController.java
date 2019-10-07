package org.lanqiao.jingdong.controller;

import org.lanqiao.jingdong.entity.BrandInfo;
import org.lanqiao.jingdong.entity.CategoryInfo;
import org.lanqiao.jingdong.entity.ProductInfo;
import org.lanqiao.jingdong.entity.ProductVo;
import org.lanqiao.jingdong.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    ProductInfoService productInfoService;

    @RequestMapping("/getNameForProduct")
    public Map getNameForSearch(@RequestBody ProductVo productVo){
        Map productMap = new HashMap();
        Integer totalCount = productInfoService.getNameForTotalCount(productVo);
        List<ProductInfo> productInfoList = productInfoService.getNameForProduct(productVo);
        productMap.put("productInfoList", productInfoList);
        productMap.put("totalCount", totalCount);
//        System.out.println("" + productMap.get("totalCount"));
        return productMap;
    }
    @RequestMapping("/getNameForBrand")
    public List<BrandInfo> getNameForBrand(String productName){
        return productInfoService.getNameForBrand(productName);
    }
    @RequestMapping("/getNameForCateTwo")
    public List<CategoryInfo> getNameForCateTwo(String productName){
        return productInfoService.getNameForCateTwo(productName);
    }
    @RequestMapping("/getCateTwoForCateThree")
    public List<CategoryInfo> getCateTwoForCateThree(Integer cateTwo,String productName){
        return productInfoService.getCateTwoForCateThree(cateTwo, productName);
    }
}
