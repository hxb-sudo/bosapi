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
public class Storage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 入库交接单号
     */
    @TableId("ID")
    private Integer id;

    /**
     * 接货时间
     */
    @TableField("AcceptDate")
    private LocalDateTime acceptdate;

    /**
     * 接货人
     */
    @TableField("AcceptPerson")
    private Integer acceptperson;

    /**
     * 接收单位
     */
    @TableField("AcceptCompany")
    private String acceptcompany;

    /**
     * 发货人
     */
    @TableField("DeliveryPerson")
    private Integer deliveryperson;

    /**
     * 发货单位
     */
    @TableField("DeliveryCompany")
    private String deliverycompany;


}
