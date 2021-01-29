package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.entity.Systememp;
import com.example.entity.Systemunits;
import com.example.service.SystemempService;
import com.example.service.SystemunitsService;
import com.example.util.Helper;
import com.example.util.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 胡晓波
 * @since 2020-11-11
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private SystemempService systemempService;
    @Autowired
    private SystemunitsService systemunitsService;
    @Autowired
    private RedisOperator redis;
    @Autowired
    private Helper helper;


    @RequestMapping("/login")
    public R login(Systememp systememp) {
        systememp.setDisabled(true);
        Systememp login = systemempService.getOne(
                new QueryWrapper<Systememp>()
                        .eq("EmpNo", systememp.getEmpno())
                        .and(
                                queryWrapper ->
                                {
                                    queryWrapper.eq("Pwd", systememp.getPwd());
                                })
        );

        if (login != null) {
            Systemunits systemunits = systemunitsService.getOne(new QueryWrapper<Systemunits>().eq("ID", login.getEmpunit()));
            login.setSystemunits(systemunits);
            String s = helper.randomToken();
            redis.setVal_Time(0, login.getEmpno(), s, 1800L); // 最后一个数字是设置登录的时间1800L代表30分钟
            Map map = new HashMap();
            map.put("user", login);
            map.put("token", s);
            return Helper.OK(map).setMsg("登录成功");
        }
        return R.failed("用户名或密码不存在").setCode(-1);
    }

    @RequestMapping("/info")
    public R info(HttpServletRequest request) {
        return Helper.OK(new String[]{"admin"});
    }


}
