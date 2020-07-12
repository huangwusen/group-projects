package com.qf.group.domain.entity;

import lombok.Data;

/**
 * 状态表
 */
@Data
public class State {
    /**
     * 状态表主键
     */
    private Integer stateId;

    /**
     * 案件编号
     */
    private Integer stateNo;

    /**
     * 0为公诉1为不公诉案件
     */
    private Integer statePublic;

    /**
     * 0为以判决1为没判决案件
     */
    private Integer stateJudgment;

    /**
     * 0为以提交1没提交案件
     */
    private Integer stateSubmit;

    /**
     * 0为以签收1为没签收
     */
    private Integer stateSign;
}