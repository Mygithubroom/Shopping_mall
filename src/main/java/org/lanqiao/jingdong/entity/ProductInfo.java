package org.lanqiao.jingdong.entity;

import java.math.BigDecimal;
import java.util.Set;

public class ProductInfo {
    private BrandInfo brandInfo;

    private Set<CategoryInfo> categoryInfoSet;

    private ProductPic productPic;

    private Integer productId;

    private String productName;

    private Integer brandId;

    private BigDecimal price;

    private Byte publishStatus;

    private String descript;


    public BrandInfo getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(BrandInfo brandInfo) {
        this.brandInfo = brandInfo;
    }

    public Set<CategoryInfo> getCategoryInfoSet() {
        return categoryInfoSet;
    }

    public void setCategoryInfoSet(Set<CategoryInfo> categoryInfoSet) {
        this.categoryInfoSet = categoryInfoSet;
    }

    public ProductPic getProductPic() {
        return productPic;
    }

    public void setProductPic(ProductPic productPic) {
        this.productPic = productPic;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Byte publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "brandInfo=" + brandInfo +
                ", categoryInfoSet=" + categoryInfoSet +
                ", productPic=" + productPic +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", brandId=" + brandId +
                ", price=" + price +
                ", publishStatus=" + publishStatus +
                ", descript='" + descript + '\'' +
                '}';
    }
}