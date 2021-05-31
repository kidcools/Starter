package com.kidcools.cn.Entity.dianpu;

import lombok.Data;

@Data
public class Item {
    private long id;
    private long pid;
    private String name;
    private float price;
    private long count;
}
