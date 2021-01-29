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
public class Logisticstransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    @TableField("TransferInt")
    private String transferint;

    @TableField("StartStation")
    private String startstation;

    @TableField("EndStation")
    private String endstation;

    @TableField("Dispatcher")
    private String dispatcher;

    @TableField("Driver")
    private String driver;

    @TableField("DeliveryPerson")
    private Integer deliveryperson;

    @TableField("DeliveryDate")
    private LocalDateTime deliverydate;


}
