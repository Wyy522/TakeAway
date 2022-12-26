package com.example.takeaway.dao;

import lombok.Data;

@Data
public class OrderInfo {
    /**
     * <pre>
     * 订单ID
     * </pre>
     */
    private Integer	orderId;

    /**
     * <pre>
     * 用户ID
     * </pre>
     */
    private Integer	userId;

    /**
     * <pre>
     * 订单状态(0已提交,1派送中,2已完成,3已取消)
     * </pre>
     */
    private Integer	orderStatus;

    /**
     * <pre>
     * 订单总金额
     * </pre>
     */
    private Integer	orderAmount;

    /**
     * <pre>
     * 多个菜品ID
     * </pre>
     */
    private String	dishIds;

    /**
     * <pre>
     * 地址
     * </pre>
     */
    private String	address;

    /**
     * <pre>
     * 电话
     * </pre>
     */
    private String	telNumber;


}
