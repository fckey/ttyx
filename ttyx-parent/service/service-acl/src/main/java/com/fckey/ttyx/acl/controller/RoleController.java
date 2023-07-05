package com.fckey.ttyx.acl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fckey.ttyx.acl.service.RoleService;
import com.fckey.ttyx.common.result.Result;
import com.fckey.ttyx.model.acl.Role;
import com.fckey.ttyx.vo.acl.RoleQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.logging.log4j.message.ReusableMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 1.0
 * @program: ttyx
 * @classname RoleController
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/07/05 10:34
 **/

@Api(tags = "用户角色")
@RestController
@RequestMapping("/admin/acl/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService roleService;
    private static final Logger log = LoggerFactory.getLogger(RoleController.class);
    /**
     * @author Jeff Fong
     * @description 角色列表，条件分页查询
     * @date 2023/7/5 10:44
     * @param: 
     * @return com.fckey.ttyx.common.result.Result
     **/
    @ApiOperation("角色条件分页查询")
    @GetMapping("{current}/{limit}")
    public Result pageList(@PathVariable(name = "current") Long current,
                           @PathVariable(name = "limit") Long limit,
                           RoleQueryVo roleQueryVo){
        // 创建page对象，传递当前页和每页记录数
        Page<Role> pageParam  =new Page<>(current, limit);
        IPage<Role> pageModel = roleService.selectRolePage(pageParam, roleQueryVo);
        return Result.ok(pageModel);
    }

    /**
     * @author Jeff Fong
     * @description 根据id查询角色
     * @date 2023/7/5 11:10
     * @param: 
     * @return com.fckey.ttyx.common.result.Result
     **/
    @ApiOperation("根据id查询角色")
    @GetMapping("get/{id}")
    public Result get(@PathVariable Long id){
        Role role = roleService.getById(id);
        return Result.ok(role);
    }
    
    /**
     * @author Jeff Fong
     * @description 添加角色
     * @date 2023/7/5 11:13
     * @param: role
     * @return com.fckey.ttyx.common.result.Result
     **/
    @ApiOperation("添加角色")
    @PostMapping("save")
    public Result save(@RequestBody Role role){
        boolean isSuccess = roleService.save(role);
        return isSuccess ? Result.ok(null) : Result.fail(null);
    }
    
    /**
     * @author Jeff Fong
     * @description 修改角色
     * @date 2023/7/5 11:16
     * @param: role
     * @return com.fckey.ttyx.common.result.Result
     **/
    @ApiOperation("修改角色")
    @PutMapping("update")
    public Result update(@RequestBody Role role){
        boolean isSuccess = roleService.updateById(role);
        return isSuccess ? Result.ok(null) : Result.fail(null);
    }
    
    /**
     * @author Jeff Fong
     * @description 根据id删除角色
     * @date 2023/7/5 11:18
     * @param: id
     * @return com.fckey.ttyx.common.result.Result
     **/
    @ApiOperation("根据id删除角色")
    @DeleteMapping("/remove/{id}")
    public Result remove(@PathVariable Long id){
        boolean isSuccess = roleService.removeById(id);
        return isSuccess ? Result.ok(null) : Result.fail(null);
    }   
    
    /**
     * @author Jeff Fong
     * @description 批量删除角色 | 数组格式对应Java中的集合
     * @date 2023/7/5 11:20
     * @param: 
     * @return com.fckey.ttyx.common.result.Result
     **/
    @ApiOperation("批量删除角色")
    @DeleteMapping("batchRemove")
    public Result batchRemove(@RequestBody List<Long>idList){
        roleService.removeByIds(idList);
        return Result.ok(null);
    }
}