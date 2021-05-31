package com.kidcools.cn.controller;

import com.kidcools.cn.Entity.AjaxResponse;
import com.kidcools.cn.Entity.dianpu.Dianpu;
import com.kidcools.cn.service.DianpuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/dianpu")
public class DianpuController {
    @Autowired
    DianpuService dianpuService;
    @RequestMapping("/all")
    @ResponseBody
    public AjaxResponse getAllDianpu(){
        //获得店铺数据
        List<Dianpu> dianpus = dianpuService.getAllDianpu();
        log.debug("店铺数据"+dianpus.toString());
        return AjaxResponse.success(dianpus);
    }
}
