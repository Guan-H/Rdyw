package com.gzcss.Rdyw.controller;


import com.gzcss.Rdyw.entity.RdywEntity;
import com.gzcss.Rdyw.entity.Test;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController()
@RequestMapping("/rdyw")
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

    @ResponseBody
    @GetMapping("test")
    public Test test(){
        Test test= new Test();
        test.setAddress("非洲");
        test.setName("大傻逼");
        test.setDate("2022-03-03");
        return test;
    }

}
