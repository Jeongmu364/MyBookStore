package com.dongseo.business.cart.impl;

import com.dongseo.business.cart.CartProductInfoVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartProductInfoDao {
    @Autowired
    private SqlSessionTemplate mybatis;

    public void insertProductInfo(CartProductInfoVo vo) {
        mybatis.insert("CartProductInfoDao.insertProductInfo", vo);
    }

    public void updateProductCount(CartProductInfoVo vo) {
        mybatis.update("CartProductInfoDao.updateProductCount", vo);
    }
}
