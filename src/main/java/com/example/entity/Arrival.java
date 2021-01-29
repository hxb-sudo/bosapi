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
public class Arrival implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("SendCompany")
    private String sendcompany;

    @TableField("CargoAddress")
    private String cargoaddress;

    @TableField("IssuePerson")
    private String issueperson;

    @TableField("IssueDate")
    private LocalDateTime issuedate;

    @TableField("WorkAddress")
    private String workaddress;

    @TableField("StorageDate")
    private LocalDateTime storagedate;

    @TableField("OutBoundDate")
    private LocalDateTime outbounddate;

    @TableField("TimeLimit")
    private LocalDateTime timelimit;

    @TableField("Batch")
    private String batch;


}
