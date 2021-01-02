package com.dongseo.business.product.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDao {
    @Autowired
    private SqlSessionTemplate mybatis;

}
