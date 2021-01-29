package com.example.controller;

import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 错误请求返回
 * */
@RestController
@RequestMapping("/error")
public class ErrorController {


    /**
     * 错误码500
     * */
    @RequestMapping("fiveHundred")
    public R fiveHundred(){
        return R.failed("身份验证过期！").setCode(500);
    }

    /**
     * 错误码-1
     * */
    @RequestMapping("minusOne")
    public R minusOne(){
        return R.failed("该账户已在其他地方登录！").setCode(-1);
    }

}
