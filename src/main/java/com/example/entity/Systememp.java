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
public class Systememp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工姓名
     */
    @TableField("EmpName")
    private String empname;

    /**
     * 工号
     */
    @TableField("EmpNo")
    private String empno;

    /**
     * 密码（MD5加密）
     */
    @TableField("Pwd")
    private String pwd;

    /**
     * 查台密码（MD5加密，小件员查询时需要用到此密码）
     */
    @TableField("QueryPwd")
    private String querypwd;

    /**
     * 角色ID
     */
    @TableField("RoleID")
    private Integer roleid;

    /**
     * 员工所属单位
     */
    @TableField("EmpUnit")
    private Integer empunit;

    /**
     * 备注
     */
    @TableField("Remark")
    private String remark;

    /**
     * 禁用（1可使用 0已禁用）
     */
    @TableField("Disabled")
    private Boolean disabled;

    /**
     * 操作员工单位
     */
    @TableField(exist = false)
    private Systemunits systemunits;

}
