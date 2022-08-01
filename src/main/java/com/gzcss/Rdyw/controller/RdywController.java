package com.gzcss.Rdyw.controller;


import com.gzcss.Rdyw.entity.RdywEntity;
import com.gzcss.Rdyw.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    public List<User> test(){
        User test= new User();
        test.setAddress("非洲");
        test.setUsername("大傻逼");
        //获取当前时间，并格式化
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        test.setDate(localDateTime);
        List<User> list = new ArrayList<>();
        list.add(test);
        return list;
    }

}
