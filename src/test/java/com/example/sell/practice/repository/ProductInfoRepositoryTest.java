package com.example.sell.practice.repository;

import com.example.sell.practice.dataObject.ProductInfo;
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
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveOne(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("rice");
        productInfo.setProductPrice(new BigDecimal(1.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("nice northeast rice");
        productInfo.setCategoryType(1);
        productInfo.setProductIcon("http://******.jpg");
        productInfo.setProductStatus(0);
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne(){
        ProductInfo result = repository.findById("1").orElse(null);
        Assert.assertEquals(new Integer(1),result.getCategoryType());
    }

    @Test
    public void findByProductStatus(){
        List<ProductInfo> result =repository.findByProductStatus(1);
        Assert.assertEquals(1,result.size());
    }
}