package com.dongseo.business.cart;

import java.util.List;

public class CartVo {
    private int id;
    private int userId;

    @Override
    public String toString() {
        return "CartVo{" +
                "id=" + id +
                ", userId=" + userId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
