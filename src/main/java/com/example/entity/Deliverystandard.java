package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

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
public class Deliverystandard implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 收派标准名称
     */
    @TableField("Name")
    private String name;

    /**
     * 最小重量
     */
    @TableField("MinWeight")
    private BigDecimal minweight;

    /**
     * 最大重量
     */
    @TableField("MaxWeight")
    private BigDecimal maxweight;

    /**
     * 操作人员ID
     */
    @TableField("OperatorID")
    private Integer operatorid;

    /**
     * 操作单位ID
     */
    @TableField("OperationUnitID")
    private Integer operationunitid;

    /**
     * 操作时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("OperationTime")
    private LocalDateTime operationtime;

    /**
     * 作废标记
     */
    @TableField("InvalidateMark")
    private Boolean invalidatemark;

    /**
     * 操作员工
     */
    @TableField(exist = false)
    private Systememp systememp;

    /**
     * 操作员工单位
     */
    @TableField(exist = false)
    private Systemunits systemunits;


}
