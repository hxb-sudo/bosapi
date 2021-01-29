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
public class Worksheet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 工作单号
     */
    @TableField("WorkSheetNo")
    private String worksheetno;

    /**
     * 到达地
     */
    @TableField("Destination")
    private String destination;

    /**
     * 产品时限
     */
    @TableField("ProductTime")
    private String producttime;

    /**
     * 总件数
     */
    @TableField("Total")
    private Integer total;

    /**
     * 重量
     */
    @TableField("Weight")
    private BigDecimal weight;

    /**
     * 配载要求
     */
    @TableField("StowageRequirements")
    private String stowagerequirements;


}
