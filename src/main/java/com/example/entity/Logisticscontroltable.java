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
public class Logisticscontroltable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 工作单号
     */
    @TableField("WorkSheetNo")
    private String worksheetno;

    /**
     * 类型
     */
    @TableField("CType")
    private Boolean ctype;

    /**
     * 代理公司
     */
    @TableField("Corporation")
    private String corporation;

    /**
     * 货票号
     */
    @TableField("WaybillID")
    private String waybillid;

    /**
     * 备注
     */
    @TableField("Remarks")
    private String remarks;

    /**
     * 录入人
     */
    @TableField("InputPerson")
    private Integer inputperson;

    /**
     * 录入时间
     */
    @TableField("InputDate")
    private LocalDateTime inputdate;

    /**
     * 录入单位
     */
    @TableField("InputCompany")
    private Integer inputcompany;


}
