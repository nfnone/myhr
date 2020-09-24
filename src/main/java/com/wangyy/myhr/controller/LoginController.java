package com.wangyy.myhr.controller;

import com.wangyy.myhr.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login(){
        return new RespBean().error("未登录，请登录");
    }

}
