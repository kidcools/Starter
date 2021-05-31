package com.kidcools.cn.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 图集entity
 */
@Data
public class Tuji {
    private long id;
    private String name;
    private String jigou;
    private int pics;
    private long userId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date uploadTime;
    @TableField(exist = false)
    private User  user;
}
