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
public class Logisticsdetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    @TableField("LogisticsInt")
    private String logisticsint;

    @TableField("CompanyName")
    private String companyname;

    @TableField("ExpectArrivalDate")
    private LocalDateTime expectarrivaldate;

    @TableField("ActualArrivalDate")
    private LocalDateTime actualarrivaldate;

    @TableField("ExpectDepartureDate")
    private LocalDateTime expectdeparturedate;

    @TableField("ActualDepartureDate")
    private LocalDateTime actualdeparturedate;

    @TableField("OperationPerson")
    private String operationperson;

    @TableField("LogisticsType")
    private String logisticstype;


}
