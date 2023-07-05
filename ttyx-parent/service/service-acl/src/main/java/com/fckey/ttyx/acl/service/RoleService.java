package com.fckey.ttyx.acl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fckey.ttyx.model.acl.Role;
import com.fckey.ttyx.vo.acl.RoleQueryVo;

/**
 * @program: ttyx
 * @className RoleService
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/07/05 10:37
 * @Version 1.0
 **/
public interface RoleService extends IService<Role> {
    // 角色列表，条件分页查询
    IPage<Role> selectRolePage(Page<Role> pageParam, RoleQueryVo roleQueryVo);
}