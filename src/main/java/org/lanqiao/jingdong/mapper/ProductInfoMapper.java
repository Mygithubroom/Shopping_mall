package org.lanqiao.jingdong.mapper;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.jingdong.entity.BrandInfo;
import org.lanqiao.jingdong.entity.CategoryInfo;
import org.lanqiao.jingdong.entity.ProductInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductInfoMapper {
    int selectByNameForTotalCount(@Param("brandId") Integer brandId, @Param("categoryId") Integer categoryId, @Param("productName") String productName);
    List<ProductInfo> selectByNameForProduct(@Param("brandId") Integer brandId, @Param("categoryId") Integer categoryId, @Param("productName") String productName, @Param("pageBegin") Integer pageBegin, @Param("pageSize") Integer pageSize);
    List<BrandInfo> selectByNameForBrand(@Param("productName") String productName);
    List<CategoryInfo> selectByNameForCateTwo(@Param("productName") String productName);
    List<CategoryInfo> selectByCateTwoForCateThree(@Param("cateTwo") Integer cateTwo, @Param("productName") String productName);

    int deleteByPrimaryKey(Integer productId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    ProductInfo selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKeyWithBLOBs(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);
}