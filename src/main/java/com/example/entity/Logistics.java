package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 胡晓波
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Logistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    @TableField("LogisticsInt")
    private String logisticsint;

    @TableField("LineName")
    private String linename;

    @TableField("StartCompany")
    private String startcompany;

    @TableField("GeneratePerson")
    private String generateperson;

    @TableField("CarInt")
    private String carint;

    @TableField("Driver")
    private String driver;

    @TableField("DriverPhone")
    private String driverphone;

    @TableField("CarType")
    private String cartype;

    @TableField("LogisticsState")
    private Integer logisticsstate;

    @TableField("IsCancel")
    private Integer iscancel;


}
