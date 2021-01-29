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
public class Checkbounddetails implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工作单号
     */
    @TableId("ID")
    private Integer id;

    /**
     * 扫描设备号
     */
    @TableField("PackageID")
    private String packageid;

    /**
     * 件数
     */
    @TableField("CargoCount")
    private Integer cargocount;

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
     * 类型
     */
    @TableField("CargoType")
    private Boolean cargotype;

    /**
     * 方向
     */
    @TableField("Direction")
    private String direction;

    /**
     * 入库人
     */
    @TableField("StoragePerson")
    private Integer storageperson;

    /**
     * 入库时间
     */
    @TableField("StorageDate")
    private LocalDateTime storagedate;


}
