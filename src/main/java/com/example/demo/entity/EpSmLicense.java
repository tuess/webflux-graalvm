package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class EpSmLicense {
    //安全资料ID(主键,自增)
    @Id
    private Long licenseId;
    //持证单位
    private Integer organizationId;
    //扫描文件(文件服务)
    private Integer fileId;
    //文件名称
    private String fileName;
    //文件分类(外键)
    private Integer typeId;
    //发证单位
    private String issueUnit;
    //持证人
    private Integer holderId;
}
