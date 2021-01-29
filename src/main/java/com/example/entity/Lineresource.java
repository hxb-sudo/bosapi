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
public class Lineresource implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("ResourceType")
    private String resourcetype;

    @TableField("Port")
    private String port;

    @TableField("Demand")
    private Integer demand;

    @TableField("VehicleInt")
    private String vehicleint;

    @TableField("Capacity")
    private String capacity;

    @TableField("WaybillID")
    private String waybillid;

    @TableField("Carrier")
    private String carrier;

    @TableField("ExpectArrivalDate")
    private LocalDateTime expectarrivaldate;

    @TableField("ExpectDepartureDate")
    private LocalDateTime expectdeparturedate;

    @TableField("Ticket")
    private Integer ticket;

    @TableField("Cargo")
    private Integer cargo;

    @TableField("Weight")
    private BigDecimal weight;

    @TableField("Volume")
    private BigDecimal volume;

    @TableField("HandlePerson")
    private String handleperson;

    @TableField("HandleDate")
    private LocalDateTime handledate;

    @TableField("EnterPerson")
    private Integer enterperson;

    @TableField("EnterDate")
    private LocalDateTime enterdate;

    @TableField("EnterCompany")
    private String entercompany;

    @TableField("AcceptPerson")
    private Integer acceptperson;

    @TableField("AcceptDate")
    private LocalDateTime acceptdate;

    @TableField("AcceptCompany")
    private String acceptcompany;

    @TableField("AbnormalRemarks")
    private String abnormalremarks;

    @TableField("WorkInt")
    private String workint;

    @TableField("Transfer")
    private Integer transfer;

    @TableField("ActualCount")
    private Integer actualcount;

    @TableField("Destination")
    private String destination;

    @TableField("WareName")
    private String warename;

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

    @TableField("SpecialEnsure")
    private String specialensure;

    @TableField("DeliveryType")
    private Integer deliverytype;

    @TableField("ImportantHints")
    private String importanthints;

    @TableField("SurplusTime")
    private LocalDateTime surplustime;


}
