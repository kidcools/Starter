package com.kidcools.cn.Entity.dianpu;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

@Data
public class Product {
    private long id;
    private long cid;
    private long did;
    private String name;
    private float price;
    @TableField(exist = false)
    private List<Item> items;
}
