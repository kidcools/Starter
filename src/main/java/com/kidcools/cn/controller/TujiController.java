package com.kidcools.cn.controller;

import com.kidcools.cn.Entity.Tuji;
import com.kidcools.cn.service.TujiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@Controller
public class TujiController {
    @Resource
    TujiService tujiServive;

    /**
     * 根据ID查询图集内容
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/tuji/{id}",method = RequestMethod.GET)
    public String getTuji(@PathVariable long id, Model model){
        Tuji tuji = tujiServive.findTujiById(id);
        model.addAttribute("data",tuji);
        if(tuji!=null){
            return "tuji";
        }else{
            return "tujierror";
        }
    }

    /**
     * 添加圖集页面
     * @return
     */
    @RequestMapping(value = "/tujiaddpage",method = RequestMethod.GET)
    public String getTujiAddPage(){
        return "addTuji";
    }


    /**
     * 添加图集
     * @return
     */
    @PostMapping(value = "/addtuji")
    public String addTuji(@RequestParam("id") long id,
                          @RequestParam("name") String name,
                          @RequestParam("jigou") String jigou,
                          @RequestParam("pics") int  pics,
                          @RequestParam("uploadTime") String date
                          ){
        Tuji tuji  = new Tuji();
        tuji.setName(name);
        tuji.setId(id);
        tuji.setJigou(jigou);
        tuji.setPics(pics);
        log.info(date);
        date = date.replace("T"," ");
        try {
            Date newDate = new SimpleDateFormat("yyyy-mm-dd HH:MM").parse(date);
            tuji.setUploadTime(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        log.info("tujiinfo"+tuji.toString());
        tujiServive.addTuji(tuji);
        return "addSuccess";
    }

    /**
     * 上传图集的第二种方式
     * @param tuji
     * @return
     */
    @PostMapping(value="/addtuji2")
    public String addTuji2(@ModelAttribute Tuji tuji){
        log.info(tuji.toString());
        tujiServive.addTuji(tuji);
        return "addSuccess";
    }

    /**
     * 获得图集列表
     * @param model
     * @return
     */
    @GetMapping(value = "/tuji")
    public String  getTujis(Model model){
       List<Tuji> tujis  = tujiServive.findAllTujis2();
       model.addAttribute("tujis",tujis);
       log.info("图集数据:"+tujis.toString());
       return "tujis";
    }

    @GetMapping(value="/tuji/del/{id}")
    public String deleteMapping(@PathVariable("id") long id){
        tujiServive.deleteTujiById(id);
        return "redirect:/tuji";
    }




}
