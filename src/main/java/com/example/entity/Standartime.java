package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class Standartime implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 时间名称
     */
    @TableField("TimeName")
    private String timename;

    /**
     * 所属单位
     */
    @TableField("SubordinateUnit")
    private Integer subordinateunit;

    /**
     * 平时上班时间
     */
    @TableField("WorkingTime")
    private LocalDate workingtime;

    /**
     * 平时下班时间
     */
    @TableField("ClosingTime")
    private LocalDate closingtime;

    /**
     * 周六上班时间
     */
    @TableField("SaturdayWorkingTime")
    private LocalDate saturdayworkingtime;

    /**
     * 周六下班时间
     */
    @TableField("SaturdayClosingTime")
    private LocalDate saturdayclosingtime;

    /**
     * 周日上班时间
     */
    @TableField("SundayWorkingTime")
    private LocalDate sundayworkingtime;

    /**
     * 周日下班时间
     */
    @TableField("SundayClosingTime")
    private LocalDate sundayclosingtime;


}
