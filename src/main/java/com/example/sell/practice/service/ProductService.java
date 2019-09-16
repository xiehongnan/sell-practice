package com.example.sell.practice.service;

import com.example.sell.practice.dataObject.ProductInfo;

import java.util.List;

/**
 * 商品明细
 * @Author minghong
 * @Date 2019/9/16 17:23
 */
public interface ProductService {

    ProductInfo saveOne(ProductInfo productInfo);

    ProductInfo findOne(String id);

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
