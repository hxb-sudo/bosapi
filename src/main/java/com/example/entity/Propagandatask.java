package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Propagandatask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 宣传概要
     */
    @TableField("Outline")
    private String outline;

    /**
     * 发布时间
     */
    @TableField("ReleaseTime")
    private LocalDateTime releasetime;

    /**
     * 失效时间
     */
    @TableField("FailureTime")
    private LocalDateTime failuretime;

    /**
     * 状态（1.开启，2.关闭）
     */
    @TableField("Status")
    private Boolean status;

    /**
     * 宣传内容
     */
    @TableField("Content")
    private String content;


}
