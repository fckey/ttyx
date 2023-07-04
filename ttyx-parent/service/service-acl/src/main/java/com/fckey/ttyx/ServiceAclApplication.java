package com.fckey.ttyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version 1.0
 * @program: ttyx
 * @classname ServiceAclApplication
 * @description: 权限管理模块启动类
 * @author: Jeff Fong
 * @create: 2023/07/04 11:24
 **/
@SpringBootApplication
//@ComponentScan("com.fckey.ttyx.common.*")
public class ServiceAclApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAclApplication.class, args);
    }

}