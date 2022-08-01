package com.gzcss.Rdyw;

import com.gzcss.Rdyw.entity.User;
import com.gzcss.Rdyw.service.UserService;
import com.gzcss.Rdyw.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RdywApplicationTests {

    @Autowired
    private UserServiceImpl userService;
    @Test
    void contextLoads() {
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }

}
