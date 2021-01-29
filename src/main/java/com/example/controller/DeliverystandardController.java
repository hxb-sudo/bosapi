package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.entity.Deliverystandard;
import com.example.entity.Systememp;
import com.example.entity.Systemunits;
import com.example.service.DeliverystandardService;
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
@RequestMapping("/deliverystandard")
public class DeliverystandardController {

    @Autowired
    private DeliverystandardService deliverystandardService;
    @Autowired
    private SystemempService systemempService;
    @Autowired
    private SystemunitsService systemunitsService;


    /**
     * 获取收派标准列表
     * */
    @RequestMapping("list")
    public R list(){
        List<Deliverystandard> list = deliverystandardService.list();
        for (Deliverystandard deliverystandard : list) {
            Systememp emp = systemempService.getById(deliverystandard.getOperatorid());
            Systemunits units = systemunitsService.getById(deliverystandard.getOperationunitid());
            deliverystandard.setSystememp(emp);
            deliverystandard.setSystemunits(units);
        }
        return Helper.OK(list);
    }

    /**
     * 通过ID作废收派标准
     * */
    @RequestMapping("invalid")
    public R invalid(Deliverystandard deliverystandard) {
        boolean id = deliverystandardService.update(new UpdateWrapper<Deliverystandard>().setSql("InvalidateMark = !InvalidateMark").eq("ID", deliverystandard.getId()));
        return Helper.OK(id);
    }

    /**
     * 添加收派标准
     * */
    @RequestMapping("add")
    public R add(Deliverystandard deliverystandard){
        boolean save = deliverystandardService.save(deliverystandard);
        return Helper.OK(save).setMsg("添加成功");
    }

    /**
     * 添加收派标准
     * */
    @RequestMapping("edit")
    public R edit(Deliverystandard deliverystandard){
        System.out.println(deliverystandard);
        boolean b = deliverystandardService.updateById(deliverystandard);
        return Helper.OK(b).setMsg("编辑成功");
    }



}
