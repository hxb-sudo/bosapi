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
public class Packaging implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 物品编码
     */
    @TableField("ItemCode")
    private String itemcode;

    /**
     * 物品名称
     */
    @TableField("ItemName")
    private String itemname;

    /**
     * 计划价格
     */
    @TableField("PlannedPrice")
    private BigDecimal plannedprice;

    /**
     * 规格
     */
    @TableField("Specifications")
    private String specifications;

    /**
     * 类型
     */
    private Boolean type;

    /**
     * 计量单位
     */
    @TableField("MeasurementUnit")
    private String measurementunit;

    /**
     * 状态（默认：正常状态1（作废状态-1））
     */
    @TableField("Status")
    private Boolean status;

    /**
     * 操作人工号
     */
    @TableField("OperatorID")
    private Integer operatorid;

    /**
     * 操作人单位
     */
    @TableField("OperationUnitID")
    private Integer operationunitid;

    /**
     * 操作时间
     */
    @TableField("OperationTime")
    private LocalDateTime operationtime;

    /**
     * 作废人工号
     */
    @TableField("InvalidateJobInt")
    private Integer invalidatejobint;

    /**
     * 作废人单位
     */
    @TableField("InvalidateName")
    private Integer invalidatename;

    /**
     * 作废时间
     */
    @TableField("InvalidateTime")
    private LocalDateTime invalidatetime;


}
