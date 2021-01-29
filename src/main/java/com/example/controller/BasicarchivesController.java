package com.example.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.example.entity.Basicarchives;
import com.example.entity.Deliverystandard;
import com.example.entity.Systememp;
import com.example.entity.Systemunits;
import com.example.service.BasicarchivesService;
import com.example.service.SystemempService;
import com.example.service.SystemunitsService;
import com.example.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 胡晓波
 * @since 2020-12-17
 */
@RestController
@RequestMapping("/basicarchives")
public class BasicarchivesController {

    @Autowired
    private BasicarchivesService basicarchivesService;
    @Autowired
    private SystemempService systemempService;
    @Autowired
    private SystemunitsService systemunitsService;


    /**
     * 获取基础档案列表
     * */
    @RequestMapping("list")
    public R list(){
        List<Basicarchives> list = basicarchivesService.list();
        for (Basicarchives basicarchives : list) {
            Systememp emp = systemempService.getById(basicarchives.getOperatorid());
            Systemunits units = systemunitsService.getById(basicarchives.getOperationunitid());
            basicarchives.setSystememp(emp);
            basicarchives.setSystemunits(units);
        }
        return Helper.OK(list);
    }

    /**
     * 添加基础档案
     * */
    @RequestMapping("add")
    public R add(Basicarchives basicarchives) {
        boolean save = basicarchivesService.save(basicarchives);
        return Helper.OK(save).setMsg("添加成功");
    }

    /**
     * 编辑基础档案
     * */
    @RequestMapping("edit")
    public R edit(Basicarchives basicarchives){
        boolean b = basicarchivesService.updateById(basicarchives);
        return Helper.OK(b).setMsg("编辑成功");
    }



}
