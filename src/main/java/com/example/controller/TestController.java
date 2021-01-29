package com.example.controller;

import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/up")
public class TestController {


    @RequestMapping("/up")
    public R up(MultipartFile file){
        // 文件上传操作

        return R.ok("http://localhost:8080/img/a.txt");
    }

}
