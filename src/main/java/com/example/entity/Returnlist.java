package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class Returnlist implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 申请单号
     */
    @TableField("ApplicationNo")
    private String applicationno;

    /**
     * 工作单号
     */
    @TableField("WorkSheetNo")
    private String worksheetno;

    /**
     * 返货类型（1、选择项为“基础设置中对应的返货原因” 2、只能选择未封存的）
     */
    @TableField("ReturnType")
    private Boolean returntype;

    /**
     * 申请备注
     */
    @TableField("ApRemark")
    private String apremark;

    /**
     * 破损丢失件数
     */
    @TableField("ApLoss")
    private Integer aploss;

    /**
     * 进港时间
     */
    @TableField("EntryTime")
    private LocalDateTime entrytime;

    /**
     * 接收单位
     */
    @TableField("ReceivegUnit")
    private Integer receivegunit;

    /**
     * 作废标志
     */
    @TableField("InvalidateSign")
    private Boolean invalidatesign;

    /**
     * 返货单位
     */
    @TableField("ReturnUnit")
    private Integer returnunit;

    /**
     * 录入时间
     */
    @TableField("RecordingTime")
    private LocalDate recordingtime;

    /**
     * 录入单位
     */
    @TableField("EntryUnit")
    private Integer entryunit;

    /**
     * 录入人
     */
    @TableField("PersonName")
    private String personname;

    /**
     * 确认时间
     */
    @TableField("ConfirmationTime")
    private LocalDateTime confirmationtime;

    /**
     * 确认单位
     */
    @TableField("ConfirmationUnit")
    private Integer confirmationunit;

    /**
     * 确认人
     */
    @TableField("ConfirmationPersonName")
    private String confirmationpersonname;

    /**
     * 发货处理状态（1=未确认，2=同意返货，3=拒绝，4=同意转发）
     */
    @TableField("TreatmentState")
    private Boolean treatmentstate;

    /**
     * 发货执行状态（1=无，2=已转发，3=已返货）
     */
    @TableField("ApReturnStatus")
    private Boolean apreturnstatus;

    /**
     * 系统自动确认标志
     */
    @TableField("IdentificationSign")
    private Boolean identificationsign;

    /**
     * 处理意见
     */
    @TableField("HandlingOpinions")
    private String handlingopinions;

    /**
     * 拒绝类型
     */
    @TableField("DenialType")
    private String denialtype;


}
