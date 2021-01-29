package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Zonecustominfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编号
     */
    @TableId(value = "CustomCode", type = IdType.AUTO)
    private Integer customcode;

    /**
     * 客户姓名
     */
    @TableField("CustomName")
    private String customname;

    /**
     * 手机号码
     */
    @TableField("MobileNo")
    private Integer mobileno;

    /**
     * 城市
     */
    @TableField("CityName")
    private String cityname;

    /**
     * 客户地址
     */
    @TableField("CustomAddress")
    private String customaddress;

    /**
     * 已关联定区
     */
    @TableField("ZoneInfoID")
    private Integer zoneinfoid;


}
