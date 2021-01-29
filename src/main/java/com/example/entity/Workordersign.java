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
public class Workordersign implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 工作单ID
     */
    @TableField("WorkOrderID")
    private Integer workorderid;

    /**
     * 工作单号
     */
    @TableField("WorkSheetNo")
    private String worksheetno;

    /**
     * 工作单类型（1=返单2=调单 3=正常单据）
     */
    @TableField("WorkOrderType")
    private Boolean workordertype;

    /**
     * 签收类型（1.正常签收,2.反向签收）
     */
    @TableField("SignType")
    private Boolean signtype;

    /**
     * 派送员工号
     */
    @TableField("CourierInt")
    private Integer courierint;

    /**
     * 派送员工名字
     */
    @TableField("CourierName")
    private String couriername;

    /**
     * 签收人
     */
    @TableField("Recipient")
    private String recipient;

    /**
     * 签收单位
     */
    @TableField("SignUnit")
    private Integer signunit;

    /**
     * 签收时间
     */
    @TableField("SignTime")
    private LocalDateTime signtime;

    /**
     * 作废标记（1=是 2=否）
     */
    @TableField("InvalidateMark")
    private Boolean invalidatemark;

    /**
     * 异常备注
     */
    @TableField("AbnormalMark")
    private String abnormalmark;

    /**
     * 录入人编码
     */
    @TableField("InputPersonCode")
    private Integer inputpersoncode;

    /**
     * 录入人
     */
    @TableField("InputPersonID")
    private Integer inputpersonid;

    /**
     * 录入单位
     */
    @TableField("InputID")
    private Integer inputid;

    /**
     * 录入时间
     */
    @TableField("InputTime")
    private LocalDateTime inputtime;


}
