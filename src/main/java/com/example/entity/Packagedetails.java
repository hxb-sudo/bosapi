package com.example.entity;

import java.math.BigDecimal;
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
public class Packagedetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    @TableField("WareName")
    private Integer warename;

    @TableField("Destination")
    private String destination;

    @TableField("Ticket")
    private Integer ticket;

    @TableField("ActualCargoInt")
    private Integer actualcargoint;

    @TableField("CargoInt")
    private Integer cargoint;

    @TableField("Weight")
    private BigDecimal weight;

    @TableField("Volume")
    private BigDecimal volume;

    @TableField("Service")
    private Integer service;

    @TableField("ImportantHints")
    private String importanthints;

    @TableField("Ask")
    private String ask;

    @TableField("InputType")
    private String inputtype;


}
