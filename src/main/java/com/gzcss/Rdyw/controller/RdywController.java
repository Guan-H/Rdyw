package com.gzcss.Rdyw.controller;


import com.gzcss.Rdyw.entity.RdywEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController()
@RequestMapping("/rwyw")
public class RdywController {

    @PostMapping("rdyw")
    public RdywEntity Rdyw(HttpServletRequest request, @RequestBody RdywEntity rdywEntity){
        RdywEntity rdywEntity1 = new RdywEntity();
        rdywEntity1.setReport_Arch(rdywEntity.getReport_Arch());
        rdywEntity1.setReport_CPUs(rdywEntity.getReport_CPUs());
        rdywEntity1.setReport_CPUType(rdywEntity.getReport_CPUType());
        rdywEntity1.setReport_DiskFree(rdywEntity.getReport_DiskFree());

        log.info(rdywEntity.toString());

        request.getSession().setAttribute("rdywEntity",rdywEntity1);
        return  rdywEntity1;
    };

}
