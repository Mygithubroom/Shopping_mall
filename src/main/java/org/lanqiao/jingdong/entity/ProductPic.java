package org.lanqiao.jingdong.entity;

public class ProductPic {
    private Integer productPicId;

    private Integer productId;

    private String mainPicDesc;

    private String mainPicUrl;

    private String littlePicUrl;

    private String searchPicUrl;

    private String searchLittlePicUrl;

    private String cartPicUrl;

    private String cartPicDesc;

    public Integer getProductPicId() {
        return productPicId;
    }

    public void setProductPicId(Integer productPicId) {
        this.productPicId = productPicId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getMainPicDesc() {
        return mainPicDesc;
    }

    public void setMainPicDesc(String mainPicDesc) {
        this.mainPicDesc = mainPicDesc == null ? null : mainPicDesc.trim();
    }

    public String getMainPicUrl() {
        return mainPicUrl;
    }

    public void setMainPicUrl(String mainPicUrl) {
        this.mainPicUrl = mainPicUrl == null ? null : mainPicUrl.trim();
    }

    public String getLittlePicUrl() {
        return littlePicUrl;
    }

    public void setLittlePicUrl(String littlePicUrl) {
        this.littlePicUrl = littlePicUrl == null ? null : littlePicUrl.trim();
    }

    public String getSearchPicUrl() {
        return searchPicUrl;
    }

    public void setSearchPicUrl(String searchPicUrl) {
        this.searchPicUrl = searchPicUrl == null ? null : searchPicUrl.trim();
    }

    public String getSearchLittlePicUrl() {
        return searchLittlePicUrl;
    }

    public void setSearchLittlePicUrl(String searchLittlePicUrl) {
        this.searchLittlePicUrl = searchLittlePicUrl == null ? null : searchLittlePicUrl.trim();
    }

    public String getCartPicUrl() {
        return cartPicUrl;
    }

    public void setCartPicUrl(String cartPicUrl) {
        this.cartPicUrl = cartPicUrl == null ? null : cartPicUrl.trim();
    }

    public String getCartPicDesc() {
        return cartPicDesc;
    }

    public void setCartPicDesc(String cartPicDesc) {
        this.cartPicDesc = cartPicDesc == null ? null : cartPicDesc.trim();
    }
}