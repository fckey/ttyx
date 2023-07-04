package com.fckey.ttyx.acl.controller;

import com.fckey.ttyx.common.result.Result;
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
    @GetMapping("info")
    public Result info(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "admin");
        map.put("avatar", "https://i0.hdslb.com/bfs/face/3b69b0cc02a7b42ae457cf7de13ddf1989787f05.jpg@240w_240h_1c_1s_!web-avatar-nav.avif");
        return Result.ok(map);
    }
    
    /**
     * @author Jeff Fong
     * @description 退出
     * @date 2023/7/4 11:42
     * @param: 
     * @return com.fckey.ttyx.common.result.Result
     **/
    @PostMapping("logout")
    public Result logout(){
        return Result.ok(null);
    }
}