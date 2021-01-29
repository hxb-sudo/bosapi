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
public class Stockitem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 入库单号(外键，对应到库存表“入库单号”)
     */
    @TableField("WarehouseNo")
    private String warehouseno;

    /**
     * 货物编号
     */
    @TableField("GoodsCode")
    private String goodscode;

    /**
     * 货物名称
     */
    @TableField("GoodsName")
    private String goodsname;

    /**
     * 入库数量
     */
    @TableField("StorageNum")
    private Integer storagenum;

    /**
     * 实际数量
     */
    @TableField("ActualNum")
    private Integer actualnum;

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
     * 状态（1.正常、2.作废）
     */
    @TableField("Status")
    private Boolean status;


}
