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
public class Shuttlebus implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 路线类型（1.全部 2.干线 3.周边 4.省内 5.临时 6.市内）
     */
    @TableField("LineType")
    private Boolean linetype;

    /**
     * 线路ID
     */
    @TableField("LineID")
    private Integer lineid;

    /**
     * 车牌号
     */
    @TableField("LicensePlateInt")
    private String licenseplateint;

    /**
     * 承运商
     */
    @TableField("Carrier")
    private String carrier;

    /**
     * 车型
     */
    @TableField("Models")
    private String models;

    /**
     * 司机
     */
    @TableField("Driver")
    private String driver;

    /**
     * 电话
     */
    @TableField("Telephone")
    private String telephone;

    /**
     * 吨控
     */
    @TableField("Ton")
    private Integer ton;

    /**
     * 备注
     */
    @TableField("Remarks")
    private String remarks;

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
    @TableField("OperationTime")
    private LocalDateTime operationtime;


}
