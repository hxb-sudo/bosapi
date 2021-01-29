package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Storagedetails implements Serializable {

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
     * 关联出库交接单
     */
    @TableField("OutBoundID")
    private String outboundid;

    /**
     * 状态
     */
    @TableField("State")
    private Boolean state;


}
