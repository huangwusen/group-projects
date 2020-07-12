package com.qf.group.domain.entity;

import lombok.Data;

/**
 * 涉案人员表
 */
@Data
public class User {
    /**
     * 主键
     */
    private Integer userId;

    /**
     * 案件编号
     */
    private Integer userNo;

    /**
     * 涉案人员名称
     */
    private String userName;

    /**
     * 性别 0为男 1为女
     */
    private Integer userSex;

    /**
     * 涉案人员身份证
     */
    private String userCard;

    /**
     * 涉案人员地址
     */
    private String userAdress;

    /**
     * 逻辑删除 0为未删除 1为删除
     */
    private Integer userIsDel;
}