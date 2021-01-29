package com.example.entity;

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
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 入库单号
     */
    @TableField("WarehouseNo")
    private String warehouseno;

    /**
     * 入库类型（1.初期库存、2.调拨入库、3.下发入库、4.盘盈调整）
     */
    @TableField("ReservoirType")
    private Boolean reservoirtype;

    /**
     * 运输单号
     */
    @TableField("Transport")
    private String transport;

    /**
     * 所属单位
     */
    @TableField("SubordinateUnit")
    private String subordinateunit;

    /**
     * 开单人工号
     */
    @TableField("DrawerNo")
    private Integer drawerno;

    /**
     * 开单人姓名
     */
    @TableField("DrawerName")
    private String drawername;

    /**
     * 开单时间
     */
    @TableField("DrawerTime")
    private LocalDateTime drawertime;

    /**
     * 备注
     */
    @TableField("Remark")
    private String remark;


}
