package com.dongseo.business.cart;

public class CartProductInfoVo {
    private int id;
    private int cartId;
    private int productId;
    private int productCount;

    @Override
    public String toString() {
        return "CartProductInfoVo{" +
                "id=" + id +
                ", cartId=" + cartId +
                ", productId=" + productId +
                ", productCount=" + productCount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
