package com.qf.group.service;

import com.qf.group.domain.dto.CaseTbDto;
import com.qf.group.domain.entity.CaseTb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaseService {
    //根据案件编号查询案件 公诉审查 精准查询
    List<CaseTbDto> selectByPublicNos(int no);

    //根据案件编号查询案件 公诉审查 精准查询
    List<CaseTbDto> selectByPublicNames(@Param("casenaem") String casenaem);


    //根据案件编号查询以判决案件 精准查询
    List<CaseTbDto> selectByJudgmentNos(@Param("no") int no);

    //根据案件名称查询以判决案件 精准查询
    List<CaseTbDto> selectByJudgmentNames(@Param("casenaem") String casename);

    //根据案件编号查询以提交案件 精准查询
    List<CaseTbDto> selectBySubmitNos(@Param("no") int no);

    //根据案件名称查询以提交案件 精准查询
    List<CaseTbDto> selectBySubmitNames(@Param("casenaem") String casenaem);
}
