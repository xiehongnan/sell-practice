package com.example.sell.practice.service;

import com.example.sell.practice.dataObject.ProductCategory;

import java.util.List;

/**
 * 商品类目
 * @Author minghong
 * @Date 2019/9/16 15:32
 */
public interface CategoryService {

    ProductCategory saveOne(ProductCategory productCategory);

    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
