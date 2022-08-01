package com.gzcss.Rdyw.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gzcss.Rdyw.entity.User;
import com.gzcss.Rdyw.mapper.UserMapper;
import com.gzcss.Rdyw.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
