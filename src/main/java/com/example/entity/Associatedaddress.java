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
public class Associatedaddress implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 定区编码
     */
    @TableField("ZoneCode")
    private String zonecode;

    /**
     * 城市
     */
    @TableField("City")
    private String city;

    /**
     * 客户地址
     */
    @TableField("CustomAddress")
    private String customaddress;

    /**
     * 已关联分区
     */
    @TableField("AssociatedPartitions")
    private Integer associatedpartitions;


}
