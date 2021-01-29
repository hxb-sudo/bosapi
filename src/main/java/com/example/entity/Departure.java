package com.example.entity;

import java.math.BigDecimal;
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
public class Departure implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("PackingID")
    private String packingid;

    @TableField("Transfer")
    private Integer transfer;

    @TableField("ActualCount")
    private Integer actualcount;

    @TableField("Destination")
    private String destination;

    @TableField("WareName")
    private Integer warename;

    @TableField("CargoCount")
    private Integer cargocount;

    @TableField("Weight")
    private BigDecimal weight;

    @TableField("Volume")
    private BigDecimal volume;

    @TableField("ActualVolume")
    private BigDecimal actualvolume;

    @TableField("TimeLimit")
    private LocalDateTime timelimit;

    @TableField("Ask")
    private String ask;

    @TableField("TakeCargoPerson")
    private String takecargoperson;

    @TableField("TackCargoAddress")
    private String tackcargoaddress;

    @TableField("Payment")
    private Integer payment;

    @TableField("ImportantHints")
    private String importanthints;

    @TableField("SurplusTime")
    private LocalDateTime surplustime;

    @TableField("EntrustCompany")
    private String entrustcompany;


}
