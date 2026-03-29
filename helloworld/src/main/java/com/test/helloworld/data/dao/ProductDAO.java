package com.test.helloworld.data.dao;

import com.test.helloworld.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}
