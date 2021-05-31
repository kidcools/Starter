package com.kidcools.cn.service;

import com.kidcools.cn.Entity.dianpu.Dianpu;

import java.util.List;

public interface DianpuService {
    List<Dianpu> getAllDianpu();
    List<Dianpu> getDianpuById(long id);
}
