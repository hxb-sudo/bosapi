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
public class Partition implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 省
     */
    @TableField("Province")
    private String province;

    /**
     * 城市
     */
    @TableField("City")
    private String city;

    /**
     * 区（县）
     */
    @TableField("County")
    private String county;

    /**
     * 定区编码
     */
    @TableField("ZoneCode")
    private String zonecode;

    /**
     * 关键字
     */
    @TableField("Keyword")
    private String keyword;

    /**
     * 起始号
     */
    @TableField("StartInt")
    private Integer startint;

    /**
     * 终止号
     */
    @TableField("TerminateInt")
    private Integer terminateint;

    /**
     * 单双号（1：单，2：双）
     */
    @TableField("SDInt")
    private Boolean sdint;


}
