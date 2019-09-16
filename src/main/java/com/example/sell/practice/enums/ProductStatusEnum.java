package com.example.sell.practice.enums;

import lombok.Getter;

/**
 * 商品状态
 * @Author minghong
 * @Date 2019/9/16 18:02
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
