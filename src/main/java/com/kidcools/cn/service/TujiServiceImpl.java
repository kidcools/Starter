package com.kidcools.cn.service;

import com.kidcools.cn.Entity.Tuji;
import com.kidcools.cn.dao.TujiDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TujiServiceImpl implements  TujiService{
    @Resource
    TujiDao tujiDao;
    @Override
    public Tuji findTujiById(long id) {
        return tujiDao.findTujiById(id);
    }

    @Override
    public void addTuji(Tuji tuji) {
        tujiDao.addTuji(tuji);
    }

    @Override
    public List<Tuji> findAllTujis() {
        return tujiDao.findAllTujis();
    }

    @Override
    public void deleteTujiById(long id) {
         tujiDao.deleteById(id);
    }

    @Override
    public List<Tuji> findAllTujis2() {
        return tujiDao.findAllTujis2();
    }
}
