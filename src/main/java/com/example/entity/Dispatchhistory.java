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
public class Dispatchhistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 调度序号
     */
    @TableField("DispatchSequence")
    private Integer dispatchsequence;

    /**
     * 操作单位
     */
    @TableField("TransferredUnit")
    private Integer transferredunit;

    /**
     * 操作人员
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
    @TableField("OperationTime")
    private LocalDateTime operationtime;

    /**
     * 备注
     */
    @TableField("Remark")
    private String remark;

    /**
     * 状态（0：正常分配，1：退回）
     */
    @TableField("Status")
    private Boolean status;

    /**
     * 退回原因
     */
    @TableField("Reason")
    private String reason;


}
