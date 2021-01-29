package com.example.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.entity.Basicarchives;
import com.example.entity.Basicarchivesentry;
import com.example.entity.Systememp;
import com.example.entity.Systemunits;
import com.example.service.BasicarchivesentryService;
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
@RequestMapping("/basicarchivesentry")
public class BasicarchivesentryController {

    @Autowired
    private BasicarchivesentryService basicarchivesentryService;
    @Autowired
    private SystemempService systemempService;
    @Autowired
    private SystemunitsService systemunitsService;


    /**
     * 基础档案条目列表
     * */
    @RequestMapping("list")
    public R list(Basicarchivesentry basicarchivesentry){
        List<Basicarchivesentry> list = basicarchivesentryService.list(new QueryWrapper<Basicarchivesentry>().eq("ParentID", basicarchivesentry.getParentid()));
        for (Basicarchivesentry bae : list) {
            Systememp emp = systemempService.getById(bae.getOperatorid());
            Systemunits units = systemunitsService.getById(bae.getOperationunitid());
            bae.setSystememp(emp);
            bae.setSystemunits(units);
        }
        return Helper.OK(list);
    }

    /**
     * 添加基础档案条目
     * */
    @RequestMapping("add")
    public R add(Basicarchivesentry basicarchivesentry){
        boolean save = basicarchivesentryService.save(basicarchivesentry);
        return Helper.OK(save).setMsg("添加成功");
    }



}
