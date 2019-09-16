package com.example.sell.practice.service.impl;

import com.example.sell.practice.dataObject.ProductInfo;
import com.example.sell.practice.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void saveOne() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("3");
        productInfo.setProductName("porridge");
        productInfo.setProductPrice(new BigDecimal(2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("nice porridge");
        productInfo.setCategoryType(3);
        productInfo.setProductIcon("http://?????.jpg");
        productInfo.setProductStatus(0);
        ProductInfo result = productService.saveOne(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
        ProductInfo result = productService.findOne("3");
        Assert.assertEquals(new Integer(3),result.getCategoryType());
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> result = productService.findByProductStatus(ProductStatusEnum.UP.getCode());
        Assert.assertEquals(2,result.size());
    }
}