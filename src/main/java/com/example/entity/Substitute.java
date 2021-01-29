package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class Substitute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工工号
     */
    @TableField("EmpNo")
    private String empno;

    /**
     * 员工名称
     */
    @TableField("EmpName")
    private String empname;

    /**
     * 手机号码
     */
    @TableField("MobileNo")
    private Integer mobileno;

    /**
     * 取派员类型
     */
    @TableField("Type")
    private Integer type;

    /**
     * 是否使用PDA（1：使用，0：不使用）
     */
    @TableField("PDA")
    private Boolean pda;

    /**
     * 收派标准（公斤）
     */
    @TableField("StandardKg")
    private BigDecimal standardkg;

    /**
     * 收派标准（长度）
     */
    @TableField("StandardLength")
    private BigDecimal standardlength;

    /**
     * 车型
     */
    @TableField("Models")
    private String models;

    /**
     * 车牌号
     */
    @TableField("PlateInt")
    private String plateint;

    /**
     * 作废标记（1：未作废，0：已作废）
     */
    @TableField("InvalidateMark")
    private Boolean invalidatemark;

    /**
     * 所属单位
     */
    @TableField("SubordinateUnit")
    private Integer subordinateunit;


}
