package com.example.takeaway.dao;

import lombok.Data;

@Data
public class DishInfo {
    /**
     * <pre>
     * 菜品ID
     * </pre>
     */
    private Integer	dishId;

    /**
     * <pre>
     * 用户ID
     * </pre>
     */
    private Integer	userId;

    /**
     * <pre>
     * 菜品名称
     * </pre>
     */
    private String	dishName;

    /**
     * <pre>
     * 菜品味道
     * </pre>
     */
    private String	dishTaste;

    /**
     * <pre>
     * 菜品详细
     * </pre>
     */
    private String	dishAbout;

    /**
     * <pre>
     * 菜品图片
     * </pre>
     */
    private String	dishPitcher;

    /**
     * <pre>
     * 菜品金额
     * </pre>
     */
    private Integer	dishAmount;

}
