package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Associatemember implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 定区编码
     */
    @TableField("ZoneCode")
    private String zonecode;

    /**
     * 取派人工号
     */
    @TableField("EmpNo")
    private String empno;

    /**
     * 取派人名称
     */
    @TableField("EmpName")
    private String empname;

    /**
     * 收派标准（公斤）
     */
    @TableField("StandarKg")
    private BigDecimal standarkg;

    /**
     * 收派标准（长度）
     */
    @TableField("StandarLength")
    private BigDecimal standarlength;

    @TableField("StandardTime")
    private LocalDateTime standardtime;

    /**
     * 所属单位
     */
    @TableField("SubordinateUnit")
    private Integer subordinateunit;

    /**
     * 类型
     */
    private String type;


}
