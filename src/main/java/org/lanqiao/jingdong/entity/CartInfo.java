package org.lanqiao.jingdong.entity;

import java.util.List;

public class CartInfo {
    private Integer cartId;

    private Integer loginId;

    private Integer productId;

    private Integer productCount;

    private Integer productTotal;

    private Integer tatol;

    private LoginInf loginInf;

    private List<ProductInfo> productInfoList;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getProductTotal() {
        return productTotal;
    }

    public void setProductTotal(Integer productTotal) {
        this.productTotal = productTotal;
    }

    public Integer getTatol() {
        return tatol;
    }

    public void setTatol(Integer tatol) {
        this.tatol = tatol;
    }

    public LoginInf getLoginInf() {
        return loginInf;
    }

    public void setLoginInf(LoginInf loginInf) {
        this.loginInf = loginInf;
    }

    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
    }
}