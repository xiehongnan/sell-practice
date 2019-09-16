package com.example.sell.practice.repository;

import com.example.sell.practice.dataObject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void saveOne(){
        ProductCategory productCategory = new ProductCategory("dinner",1);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne(){
        ProductCategory result = repository.findById(1).orElse(null);
        Assert.assertEquals("dinner",result.getCategoryName());
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(1,2);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertEquals(2,result.size());
    }
}