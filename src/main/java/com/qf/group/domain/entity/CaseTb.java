package com.qf.group.domain.entity;

import java.util.Date;
import lombok.Data;

/**
    * 案件表
    */
@Data
public class CaseTb {
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

    private State state;
}