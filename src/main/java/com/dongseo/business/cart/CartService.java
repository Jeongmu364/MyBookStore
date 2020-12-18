package com.dongseo.business.cart;

import java.util.Map;

public interface CartService {
    Map<String, Object> getProductList(CartVo vo);

    void deleteProductInfo(CartVo vo);

    void insertProductInfo(CartVo vo);

    void updateProductInfo(CartVo vo);
}
