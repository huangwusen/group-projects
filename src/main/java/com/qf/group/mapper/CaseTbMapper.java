package com.qf.group.mapper;

import com.qf.group.domain.dto.CaseTbDto;
import com.qf.group.domain.entity.CaseTb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaseTbMapper {
    //根据案件编号查询案件 公诉审查 精准查询
    List<CaseTbDto> selectByPublicNo(@Param("no") int no);

    //根据案件名称查询案件 公诉审查 精准查询
    List<CaseTbDto> selectByPublicName(@Param("casenaem") String casenaem);

    //根据案件编号查询以判决案件 精准查询
    List<CaseTbDto> selectByJudgmentNo(@Param("no") int no);

    //根据案件名称查询以判决案件 精准查询
    List<CaseTbDto> selectByJudgmentName(@Param("casenaem") String casename);

    //根据案件编号查询以提交案件 精准查询
    List<CaseTbDto> selectBySubmitNo(@Param("no") int no);

    //根据案件名称查询以提交案件 精准查询
    List<CaseTbDto> selectBySubmitName(@Param("casenaem") String casenaem);
}