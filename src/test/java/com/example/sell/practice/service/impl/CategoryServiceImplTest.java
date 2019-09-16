package com.example.sell.practice.service.impl;

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
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void saveOne() {
        ProductCategory productCategory = new ProductCategory("breakfast",3);
        ProductCategory result = categoryService.saveOne(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
        ProductCategory result = categoryService.findOne(2);
        Assert.assertEquals("lunch",result.getCategoryName());
    }

    @Test
    public void findAll() {
        List<ProductCategory> result = categoryService.findAll();
        Assert.assertEquals(3,result.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(1,2);
        List<ProductCategory> result = categoryService.findByCategoryTypeIn(list);
        Assert.assertEquals(2,result.size());
    }
}