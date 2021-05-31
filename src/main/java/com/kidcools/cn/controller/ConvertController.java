package com.kidcools.cn.controller;

import com.kidcools.cn.Entity.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ConvertController {
    @RequestMapping(value = "/kidools/{id}",method = RequestMethod.GET)
    public @ResponseBody  AjaxResponse getKidcools(@PathVariable("id") long id, @RequestParam("a") String a){
        log.info("id="+id+"   a="+a);
        return AjaxResponse.success();
    }
}
