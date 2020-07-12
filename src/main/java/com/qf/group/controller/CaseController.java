package com.qf.group.controller;

import com.qf.group.domain.dto.CaseTbDto;
import com.qf.group.domain.entity.CaseTb;
import com.qf.group.service.CaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CaseController {
    @Resource
    CaseService caseService;
    @GetMapping("/selectno")
    public List<CaseTbDto> selectByPublicNoc(int no){
        List<CaseTbDto> caseTbs = caseService.selectByPublicNos(no);
        System.out.println(caseTbs);
        return caseTbs;
    }
    @GetMapping("/selectname")
    public List<CaseTbDto> selectByPublicNamec(String name){
        List<CaseTbDto> caseTbs = caseService.selectByPublicNames(name);
        System.out.println(caseTbs);
        return caseTbs;
    }
}
