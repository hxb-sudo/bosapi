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
public class Outbound implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 出库交接单号
     */
    @TableId("ID")
    private Integer id;

    /**
     * 交接单类型
     */
    @TableField("HandoverType")
    private Boolean handovertype;

    /**
     * 线路资源
     */
    @TableField("Line")
    private String line;

    /**
     * 物流方向
     */
    @TableField("Direction")
    private Integer direction;

    /**
     * 接货人
     */
    @TableField("AcceptPerson")
    private Integer acceptperson;

    /**
     * 承运商
     */
    @TableField("Carriers")
    private Integer carriers;

    /**
     * 出货人
     */
    @TableField("DeliveryPerson")
    private Integer deliveryperson;

    /**
     * 出货时间
     */
    @TableField("DeliveryDate")
    private LocalDateTime deliverydate;

    /**
     * 出货单位
     */
    @TableField("DeliveryCompany")
    private String deliverycompany;

    /**
     * 确认人
     */
    @TableField("EnterPerson")
    private Integer enterperson;

    /**
     * 确认时间
     */
    @TableField("EnterDate")
    private LocalDateTime enterdate;


}
