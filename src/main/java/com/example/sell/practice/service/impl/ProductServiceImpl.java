package com.example.sell.practice.service.impl;

import com.example.sell.practice.dataObject.ProductInfo;
import com.example.sell.practice.repository.ProductInfoRepository;
import com.example.sell.practice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品明细
 * @Author minghong
 * @Date 2019/9/16 17:26
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo saveOne(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public ProductInfo findOne(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ProductInfo> findByProductStatus(Integer productStatus) {
        return repository.findByProductStatus(productStatus);
    }
}
