package com.kidcools.cn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kidcools.cn.Entity.Tuji;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TujiMapper extends BaseMapper<Tuji> {
    /**
     * 搜索所有的图集
     * @return
     */
    List<Tuji> selectTujis();
}
