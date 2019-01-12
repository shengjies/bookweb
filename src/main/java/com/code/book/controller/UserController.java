package com.code.book.controller;

import com.code.book.service.IUserService;
import com.code.book.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/page")
    public PageUtils findPage(String user_login_name,
                              @RequestParam(name = "page",defaultValue = "1")int page,
                              @RequestParam(name = "size",defaultValue = "5")int size){
        try {
            return  userService.findPage(user_login_name,page,size);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new PageUtils();
    }
}
