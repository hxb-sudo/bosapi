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
public class Businessadmissibility implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 业务通知单号
     */
    @TableField("BusinessNoticeNo")
    private String businessnoticeno;

    /**
     * 预约收件时间
     */
    @TableField("ReservationTime")
    private LocalDateTime reservationtime;

    /**
     * 客户名称
     */
    @TableField("CustomName")
    private String customname;

    /**
     * 取件地址
     */
    @TableField("PickupAddress")
    private String pickupaddress;

    /**
     * 客户编号
     */
    @TableField("CustomCode")
    private String customcode;

    /**
     * 联系人
     */
    @TableField("Linkman")
    private String linkman;

    /**
     * 电话
     */
    @TableField("TelPhone")
    private String telphone;

    /**
     * 重量
     */
    @TableField("Weight")
    private BigDecimal weight;

    /**
     * 体积
     */
    @TableField("Volume")
    private BigDecimal volume;

    /**
     * 重要提示
     */
    @TableField("ImportantHints")
    private String importanthints;

    /**
     * 达到城市
     */
    @TableField("ArriveCity")
    private String arrivecity;

    /**
     * 取货人员信息
     */
    @TableField("PickerInfo")
    private Integer pickerinfo;

    /**
     * 派送地址
     */
    @TableField("SendAddress")
    private String sendaddress;

    /**
     * 处理单位
     */
    @TableField("ProcessingUnit")
    private Integer processingunit;

    /**
     * 通知单来源
     */
    @TableField("NotificationSource")
    private Boolean notificationsource;

    /**
     * 客户单号修改标志
     */
    @TableField("CustomNoModifyFlag")
    private Boolean customnomodifyflag;

    /**
     * 分单类型
     */
    @TableField("SingleType")
    private String singletype;

    /**
     * 件数
     */
    @TableField("PackagesNum")
    private Integer packagesnum;

    /**
     * 实际重量
     */
    @TableField("ActualWeight")
    private BigDecimal actualweight;

    /**
     * 计费重量
     */
    @TableField("BillingWeight")
    private BigDecimal billingweight;

    /**
     * 包装费
     */
    @TableField("PackingFee")
    private BigDecimal packingfee;

    /**
     * 实际包装（1.木箱，2。纸箱）
     */
    @TableField("ActualPacking")
    private Boolean actualpacking;


}
