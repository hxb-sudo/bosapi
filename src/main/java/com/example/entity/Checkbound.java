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
public class Checkbound implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 盘库单号
     */
    @TableId("ID")
    private Integer id;

    /**
     * 扫描设备号
     */
    @TableField("ScanID")
    private Integer scanid;

    /**
     * 总件数
     */
    @TableField("CargoSum")
    private Integer cargosum;

    /**
     * 盘库人
     */
    @TableField("CheckPerson")
    private Integer checkperson;

    /**
     * 盘库时间
     */
    @TableField("CheckDate")
    private LocalDateTime checkdate;

    /**
     * 操作单位
     */
    @TableField("CheckCompany")
    private String checkcompany;


}
