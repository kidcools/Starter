package com.kidcools.cn.dao;

import com.kidcools.cn.Entity.Tuji;

import java.util.List;

public interface TujiDao {
    Tuji findTujiById(long id);

    void addTuji(Tuji tuji);

    List<Tuji> findAllTujis();

    void deleteById(long id);

    List<Tuji> findAllTujis2();
}
