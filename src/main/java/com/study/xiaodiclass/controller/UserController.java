package com.study.xiaodiclass.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @date 2023/7/12
 */


@RestController
@RequestMapping("/api-/")
public class UserController {

    @GetMapping("login")
    @ResponseBody
    public String login(){
        System.out.println("哈哈哈哈");
        return "哈哈";
    }
}
