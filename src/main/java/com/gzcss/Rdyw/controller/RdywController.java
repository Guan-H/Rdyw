package com.gzcss.Rdyw.controller;


import com.gzcss.Rdyw.entity.RdywEntity;
import com.gzcss.Rdyw.entity.Test;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController()
@RequestMapping("/rdyw")
public class RdywController {

    @PostMapping("rdyw")
    public void Rdyw(HttpServletRequest request, @RequestBody RdywEntity rdywEntity){
        log.info("接收到的数据{}",rdywEntity);

    };

    @ResponseBody
    @GetMapping("test")
    public List<Test> test(){
        Test test= new Test();
        test.setAddress("非洲");
        test.setName("大傻逼");
        test.setDate("2022-03-03");
        List<Test> list = new ArrayList<>();
        list.add(test);
        return list;
    }

}
