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
public class Track implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    @TableField("LineType")
    private String linetype;

    @TableField("LineName")
    private String linename;

    @TableField("LogisticsCar")
    private String logisticscar;

    @TableField("LineState")
    private Integer linestate;

    @TableField("NodeName")
    private String nodename;

    @TableField("StartTime")
    private LocalDateTime starttime;

    @TableField("ArrivalTime")
    private LocalDateTime arrivaltime;

    @TableField("CarInt")
    private String carint;

    @TableField("NextNodeLoad")
    private String nextnodeload;

    @TableField("Describe")
    private String describe;


}
