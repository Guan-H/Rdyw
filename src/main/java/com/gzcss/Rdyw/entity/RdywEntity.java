package com.gzcss.Rdyw.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RdywEntity {

    private String reportCPUs;    //CPU数量
    private String reportCPUType;    //CPU类型
    private String reportArch;    //CPU架构
    private String reportMemTotal;    //内存总容量(MB)
    private String reportMemFree;    //内存剩余(MB)
    private String reportMemUsedPercent;    //内存使用率%
    private String reportDiskTotal;    //硬盘总容量(GB)
    private String reportDiskFree;    //硬盘剩余(GB)
    private String reportDiskUsedPercent;    //硬盘使用率%
    private LocalDateTime updateTime;   //更新时间


}
