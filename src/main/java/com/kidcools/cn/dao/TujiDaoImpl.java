package com.kidcools.cn.dao;

import com.kidcools.cn.Entity.Tuji;
import com.kidcools.cn.mapper.TujiMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class TujiDaoImpl implements  TujiDao{
    @Resource
    TujiMapper tujiMapper;
    @Override
    public Tuji findTujiById(long id) {
        Tuji tuji = tujiMapper.selectById(id);
        return tuji;
    }


    @Override
    public void addTuji(Tuji tuji) {
        tujiMapper.insert(tuji);
    }

    @Override
    public List<Tuji> findAllTujis() {
        List<Tuji> tujis = tujiMapper.selectList(null);
        return  tujis;
    }

    @Override
    public void deleteById(long id) {
        tujiMapper.deleteById(id);
    }

    @Override
    public List<Tuji> findAllTujis2() {
        List<Tuji> tujis = tujiMapper.selectTujis();
        return tujis;
    }


}
