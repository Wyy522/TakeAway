package com.example.takeaway.dao;

import lombok.Data;

@Data
public class UserInfo {
    /**
     * <pre>
     * 用户ID
     * </pre>
     */
    private Integer	userId;

    /**
     * <pre>
     * 用户姓名
     * </pre>
     */
    private String	userName;

    /**
     * <pre>
     * 用户密码
     * </pre>
     */
    private String	userPasswd;

    /**
     * <pre>
     * 用户类型(0为管理员，1为操作员)
     * </pre>
     */
    private Integer	userType;


}
