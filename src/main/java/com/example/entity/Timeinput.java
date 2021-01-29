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
public class Timeinput implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    @TableField("InputType")
    private String inputtype;

    @TableField("Port")
    private String port;

    @TableField("Demand")
    private Integer demand;

    @TableField("VehicleInt")
    private String vehicleint;

    @TableField("WaybillID")
    private String waybillid;

    @TableField("ExpectArrivalDate")
    private LocalDateTime expectarrivaldate;

    @TableField("ExpectDepartureDate")
    private LocalDateTime expectdeparturedate;

    @TableField("ActualArrivalDate")
    private LocalDateTime actualarrivaldate;

    @TableField("ActualDepartureDate")
    private LocalDateTime actualdeparturedate;

    @TableField("Start")
    private String start;

    @TableField("Carriers")
    private Integer carriers;

    @TableField("Remarks")
    private String remarks;

    @TableField("InputPerson")
    private Integer inputperson;

    @TableField("InputDate")
    private LocalDateTime inputdate;


}
