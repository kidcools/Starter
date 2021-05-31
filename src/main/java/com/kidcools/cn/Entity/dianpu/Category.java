package com.kidcools.cn.Entity.dianpu;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

@Data
public class Category {
    private long id;
    private String name;
    @TableField(exist = false)
    private List<Product> products;
}
