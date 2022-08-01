package com.gzcss.Rdyw.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class User {
    LocalDateTime date;
    String username;
    String address;
}
