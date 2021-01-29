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
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 合包号
     */
    @TableId("ID")
    private Integer id;

    /**
     * 合包人
     */
    @TableField("PackagePerson")
    private Integer packageperson;

    /**
     * 封签号（原设备号）
     */
    @TableField("SealInt")
    private String sealint;

    /**
     * 到达地
     */
    @TableField("Destination")
    private String destination;

    /**
     * 计算到达地
     */
    @TableField("ReckonDes")
    private String reckondes;

    /**
     * 送达时限
     */
    @TableField("TimeLimit")
    private LocalDateTime timelimit;

    /**
     * 总票数
     */
    @TableField("TicketSum")
    private Integer ticketsum;

    /**
     * 总件数
     */
    @TableField("CargoSum")
    private Integer cargosum;

    /**
     * 总重量
     */
    @TableField("WeightSum")
    private BigDecimal weightsum;

    /**
     * 总体积
     */
    @TableField("VolumeSum")
    private BigDecimal volumesum;

    /**
     * 状态
     */
    @TableField("State")
    private Boolean state;

    /**
     * 配载要求
     */
    @TableField("Ask")
    private Integer ask;


}
