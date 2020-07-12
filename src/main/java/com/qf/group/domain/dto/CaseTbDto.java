package com.qf.group.domain.dto;

import lombok.Data;

import java.util.Date;
@Data
public class CaseTbDto {
    /**
     * 主键
     */
    private Integer caseId;

    /**
     * 案件编号
     */
    private Integer caseNo;

    /**
     * 案件名称
     */
    private String caseName;

    /**
     * 案件创建时间
     */
    private Date caseCreateDate;

    /**
     * 案件修改时间
     */
    private Date caseUpdate;

    /**
     * 案件管理机构
     */
    private String caseDepartment;

    /**
     * 逻辑删除 0为未删除 1为删除
     */
    private Integer caseIsDel;

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
