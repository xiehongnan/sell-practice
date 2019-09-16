package com.example.sell.practice.repository;

import com.example.sell.practice.dataObject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品明细
 * @Author minghong
 * @Date 2019/9/16 16:31
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
