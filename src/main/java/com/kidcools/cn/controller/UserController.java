package com.kidcools.cn.controller;

import com.kidcools.cn.Entity.AjaxResponse;
import com.kidcools.cn.Entity.User;
import com.kidcools.cn.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@Slf4j
@Controller
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 获得用户添加界面
     * @return
     */
    @GetMapping("/users/useraddpage")
    public  String addUserPage(){
        return "user/useraddpage";
    }
    /**
     * 网页添加User
     * @param user
     * @return
     */
    @PostMapping("/users/addUser")
    public String addUser2(@ModelAttribute User user){
        log.info(user.toString());
        userService.addUser(user);
        return "addSuccess";
    }

    @GetMapping("/users/listall")
    public String listAllUsers(Model model){
        model.addAttribute("users",userService.findUsers());
        return "user/users";
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public AjaxResponse addUser(@RequestBody User user){
        //user数据的合法性校验
        userService.addUser(user);
        return AjaxResponse.success("添加成功");
    }

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    public AjaxResponse findUserById(@PathVariable long  id){
        //参数合法性校验
        User user = userService.findUserById(id);
        return AjaxResponse.success(user);
    }

    /**
     * 查询所有用户
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public AjaxResponse  findUsers(){
        //参数合法性校验
        List<User> users = userService.findUsers();
        log.info("用户数据:"+users);
        return AjaxResponse.success(users);
    }

}
