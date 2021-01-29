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
public class Outbounddetails implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 单号
     */
    @TableId("ID")
    private Integer id;

    /**
     * 合包号
     */
    @TableField("PackageID")
    private String packageid;

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
     * 扫描时间
     */
    @TableField("ScanDate")
    private LocalDateTime scandate;

    /**
     * 是否扫描（1：是   0：否）
     */
    @TableField("IsScan")
    private Boolean isscan;

    /**
     * 是否下环节入库（1：是   0：否）
     */
    @TableField("IsNextStorage")
    private Boolean isnextstorage;

    /**
     * 是否二次入库（1：是   0：否）
     */
    @TableField("IsDoubleStorage")
    private Boolean isdoublestorage;


}
