package com.kidcools.cn.service;

import com.kidcools.cn.Entity.Tuji;

import java.util.List;

public interface TujiService {

    Tuji findTujiById(long id);

    void addTuji(Tuji tuji);

    List<Tuji> findAllTujis();

    void deleteTujiById(long id);

    List<Tuji> findAllTujis2();
}
