package com.example.entity;

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
public class Extract implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("VehicleInt")
    private String vehicleint;

    @TableField("TransportWay")
    private String transportway;

    @TableField("WaybillID")
    private String waybillid;

    @TableField("EstimateDate")
    private LocalDateTime estimatedate;

    @TableField("CargoN")
    private Integer cargon;

    @TableField("ImportantHints")
    private String importanthints;


}
