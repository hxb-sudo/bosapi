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
public class Workorder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 业务通知单号（外键，对应到业务受理表“业务通知单号”）
     */
    @TableField("BusinessNoticeNo")
    private String businessnoticeno;

    /**
     * 工单号
     */
    @TableField("JobNo")
    private String jobno;

    /**
     * 工单类型（1：新，2：追，3：销）
     */
    @TableField("JobType")
    private Boolean jobtype;

    /**
     * 取件状态（1：新单，2：已通知，3：已确认，4：已取件，5：已取消）
     */
    @TableField("PickupStatus")
    private Boolean pickupstatus;

    /**
     * 短信序号
     */
    @TableField("ShortMessageInt")
    private Integer shortmessageint;

    /**
     * 工单生成时间
     */
    @TableField("WorkGenerationTime")
    private LocalDateTime workgenerationtime;

    /**
     * 追单次数
     */
    @TableField("AfterSingleNum")
    private Integer aftersinglenum;

    /**
     * 小件员编号
     */
    @TableField("SmallMemberNum")
    private Integer smallmembernum;

    /**
     * 取件单位（外键，对应到单位表ID）
     */
    @TableField("PickupUnit")
    private Integer pickupunit;

    /**
     * 取件时间
     */
    @TableField("PickupTime")
    private LocalDateTime pickuptime;

    /**
     * 分拣编号
     */
    @TableField("SortingCode")
    private String sortingcode;


}
