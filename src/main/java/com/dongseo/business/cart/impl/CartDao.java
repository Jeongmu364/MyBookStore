package com.dongseo.business.cart.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDao {
    @Autowired
    private SqlSessionTemplate mybatis;

}
