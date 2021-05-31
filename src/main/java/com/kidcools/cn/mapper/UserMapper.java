package com.kidcools.cn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kidcools.cn.Entity.Tuji;
import com.kidcools.cn.Entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {
    public List<User> selectUsers();
    public Map<Long,List<Tuji>> selectUsers2();

}
