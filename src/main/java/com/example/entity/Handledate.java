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
public class Handledate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    @TableField("LaunchDate")
    private LocalDateTime launchdate;

    @TableField("LaunchPerson")
    private String launchperson;

    @TableField("LaunchCompany")
    private String launchcompany;

    @TableField("AbnormalType")
    private Integer abnormaltype;

    @TableField("TransferInt")
    private String transferint;

    @TableField("CargoInt")
    private String cargoint;

    @TableField("PackageInt")
    private String packageint;

    @TableField("HedgeAbnInt")
    private Integer hedgeabnint;

    @TableField("AboState")
    private Integer abostate;

    @TableField("HandleDate")
    private LocalDateTime handledate;


}
