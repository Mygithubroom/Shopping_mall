package org.lanqiao.jingdong.entity;

public class ProductVo {
    private int brandId;
    private int categoryId;
    private String productName;
    private int pageNum;
    private int pageSize;
    private String priceSort;
    private String saleSort;

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getPriceSort() {
        return priceSort;
    }

    public void setPriceSort(String priceSort) {
        this.priceSort = priceSort;
    }

    public String getSaleSort() {
        return saleSort;
    }

    public void setSaleSort(String saleSort) {
        this.saleSort = saleSort;
    }
}
