package com.kidcools.cn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kidcools.cn.Entity.dianpu.Dianpu;

import java.util.List;

public interface DianpuMapper extends BaseMapper<Dianpu> {
    public List<Dianpu> getDianpuInfo();
}
