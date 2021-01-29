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
public class Systemmenus implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 上级菜单ID
     */
    @TableField("parentID")
    private Integer parentid;

    /**
     * 栏目类型
     */
    private String type;

    /**
     * 栏目名称
     */
    private String text;

    /**
     * 栏目地址
     */
    private String url;

    /**
     * 提示语
     */
    private String tip;


}
