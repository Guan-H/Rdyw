package com.gzcss.Rdyw.entity;

import lombok.Data;

@Data
public class RdywEntity {

    private String report_CPUs="";    //CPU数量
    private String report_CPUType="";    //CPU类型
    private String report_Arch="";    //CPU架构
    private String report_MemTotal="";    //内存总容量(MB)
    private String report_MemFree="";    //内存剩余(MB)
    private String report_MemUsedPercent="";    //内存使用率%
    private String report_DiskTotal="";    //硬盘总容量(GB)
    private String report_DiskFree="";    //硬盘剩余(GB)
    private String report_DiskUsedPercent="";    //硬盘使用率%


}
