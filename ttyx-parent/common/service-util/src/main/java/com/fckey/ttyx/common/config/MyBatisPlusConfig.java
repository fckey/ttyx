package com.fckey.ttyx.common.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @version 1.0
 * @program: ttyx
 * @classname MyBatisPlusConfig
 * @description: mybatis配置类
 * @author: Jeff Fong
 * @create: 2023/07/03 10:07
 **/
@EnableTransactionManagement
@Configuration
@MapperScan("com.fckey.ttyx.*.mapper")
public class MyBatisPlusConfig {

    /**
     * @author Jeff Fong
     * @description mybatis分页插件
     * @date 2023/7/3 10:08
     * @param: 
     * @return com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor
     **/
    @Bean
    public MybatisPlusInterceptor optimisticLockerInnerInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //向Mybatis过滤器链中添加分页拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}