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
public class Zoneinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 定区编号
     */
    @TableField("ZoneCode")
    private String zonecode;

    /**
     * 定区名称
     */
    @TableField("ZoneName")
    private String zonename;

    /**
     * 定区负责人ID（员工表ID）
     */
    @TableField("ZonePeople")
    private Integer zonepeople;

    /**
     * 联系电话
     */
    @TableField("TelPhone")
    private String telphone;

    /**
     * 所属单位ID（单位表ID）
     */
    @TableField("SubordinateUnit")
    private Integer subordinateunit;


}
