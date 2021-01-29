package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

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
public class Basicarchives implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 基本档案名称
     */
    @TableField("Name")
    private String name;

    /**
     * 档案是否分级（1：是，0：否）
     */
    @TableField("Grade")
    private Boolean grade;

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
     * 操作单位
     */
    @TableField("OperationUnitID")
    private Integer operationunitid;

    /**
     * 操作时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("OperationTime")
    private LocalDateTime operationtime;

    /**
     * 操作员工
     */
    @TableField(exist = false)
    private Systememp systememp;

    /**
     * 操作员工单位
     */
    @TableField(exist = false)
    private Systemunits systemunits;

}
