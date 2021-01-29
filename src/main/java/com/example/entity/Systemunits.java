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
public class Systemunits implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 单位名称
     */
    @TableField("Name")
    private String name;

    /**
     * 备注
     */
    @TableField("Remarks")
    private String remarks;

    /**
     * 操作人员，用户表ID
     */
    @TableField("OPeratorID")
    private Integer operatorid;

    /**
     * 当前操作时间
     */
    @TableField("OPerationTime")
    private LocalDateTime operationtime;


}
