package com.qf.group.service.Impl;

import com.qf.group.domain.dto.CaseTbDto;
import com.qf.group.domain.entity.CaseTb;
import com.qf.group.mapper.CaseTbMapper;
import com.qf.group.mapper.StateMapper;
import com.qf.group.service.CaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CaseServiceImpl implements CaseService {
    @Resource
    CaseTbMapper caseTbMapper;
    @Resource
    StateMapper stateMapper;

    @Override
    public List<CaseTbDto> selectByPublicNos(int no) {
        List<CaseTbDto> caseTbs = caseTbMapper.selectByPublicNo(no);
        return caseTbs;
    }

    @Override
    public List<CaseTbDto> selectByPublicNames(String casenaem) {
        List<CaseTbDto> caseTbs = caseTbMapper.selectByPublicName(casenaem);
        return caseTbs;
    }

    @Override
    public List<CaseTbDto> selectByJudgmentNos(int no) {
        return null;
    }

    @Override
    public List<CaseTbDto> selectByJudgmentNames(String casename) {
        return null;
    }

    @Override
    public List<CaseTbDto> selectBySubmitNos(int no) {
        return null;
    }

    @Override
    public List<CaseTbDto> selectBySubmitNames(String casenaem) {
        return null;
    }
}
