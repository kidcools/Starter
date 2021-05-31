package com.kidcools.cn.service;

import com.kidcools.cn.Entity.dianpu.Dianpu;
import com.kidcools.cn.mapper.DianpuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DianpuServiceImpl implements DianpuService{
    @Autowired
    private DianpuMapper dianpuMapper;
    @Override
    public List<Dianpu> getAllDianpu() {
        List<Dianpu> dianpus = dianpuMapper.getDianpuInfo();
        return dianpus;
    }
}
