package com.fckey.ttyx.acl.controller;

import com.fckey.ttyx.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @program: ttyx
 * @classname IndexController
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/07/04 11:35
 **/
@Api(tags = "登录接口")
@RestController
@RequestMapping("/admin/acl/index")
public class IndexController {
    
    /**
     * @author Jeff Fong
     * @description 登录的接口
     * @date 2023/7/4 11:38
     * @param: 
     * @return com.fckey.ttyx.common.result.Result
     **/
    @ApiOperation("登录")
    @PostMapping("login")
    public Result login(){
        // 返回token的值
        Map<String, String> map = new HashMap<>();
        map.put("token", "token-admin");
        return Result.ok(map);
    }
    
    /**
     * @author Jeff Fong
     * @description 返回用户信息
     * @date 2023/7/4 11:40
     * @param: 
     * @return com.fckey.ttyx.common.result.Result
     **/
    @ApiOperation("获取信息")
    @GetMapping("info")
    public Result info(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "admin");
        map.put("avatar", "https://img2.baidu.com/it/u=270755821,1298894760&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500");
        return Result.ok(map);
    }
    
    /**
     * @author Jeff Fong
     * @description 退出
     * @date 2023/7/4 11:42
     * @param: 
     * @return com.fckey.ttyx.common.result.Result
     **/
    @ApiOperation("退出")
    @PostMapping("logout")
    public Result logout(){
        return Result.ok(null);
    }
}