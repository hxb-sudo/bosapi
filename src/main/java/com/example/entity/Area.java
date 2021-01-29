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
public class Area implements Serializable {

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
     * 邮政编码
     */
    @TableField("PostalCode")
    private Integer postalcode;

    /**
     * 简码
     */
    @TableField("SimpleCode")
    private String simplecode;

    /**
     * 城市编码
     */
    @TableField("CityCode")
    private Integer citycode;

    /**
     * 进港单位
     */
    @TableField("EntryUnitID")
    private String entryunitid;

    /**
     * 出港单位
     */
    @TableField("ComplementUnitID")
    private String complementunitid;

    /**
     * 性质（1.省级 2.市辖市 3.直辖市 4.县级 5.地级 6.省会）
     */
    @TableField("Nature")
    private Boolean nature;

    /**
     * 所属区域（1.东北区 2.华东区 3.华南区 4.西北区 5.华中区 6.西南区 7.华北区）
     */
    @TableField("TheArea")
    private Boolean thearea;


}
