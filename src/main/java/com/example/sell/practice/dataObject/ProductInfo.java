package com.example.sell.practice.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author minghong
 * @Date 2019/9/16 16:26
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    /** 商品ID */
    @Id
    private String productId;

    /** 名称 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 库存 */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 小图 */
    private String productIcon;

    /** 状态 0正常1下架 */
    private Integer productStatus;

    /** 类目编号 */
    private Integer categoryType;
}
