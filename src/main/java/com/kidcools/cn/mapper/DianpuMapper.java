package com.kidcools.cn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kidcools.cn.Entity.dianpu.Dianpu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DianpuMapper extends BaseMapper<Dianpu> {
    public List<Dianpu> getDianpuInfo();
    public List<Dianpu> getDianpuById(@Param("id")long id);
}
