package com.example.sell.practice.service.impl;

import com.example.sell.practice.dataObject.ProductCategory;
import com.example.sell.practice.repository.ProductCategoryRepository;
import com.example.sell.practice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品类目
 * @Author minghong
 * @Date 2019/9/16 15:37
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory saveOne(ProductCategory productCategory) {
        return repository.save(productCategory);
    }

    @Override
    public ProductCategory findOne(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }
}
