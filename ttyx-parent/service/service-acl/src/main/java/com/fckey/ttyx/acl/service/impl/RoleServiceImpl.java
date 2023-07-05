package com.fckey.ttyx.acl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fckey.ttyx.acl.mapper.RoleMapper;
import com.fckey.ttyx.acl.service.RoleService;
import com.fckey.ttyx.model.acl.Role;
import com.fckey.ttyx.vo.acl.RoleQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @version 1.0
 * @program: ttyx
 * @classname RoleServiceImpl
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/07/05 10:38
 **/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    /**
     * @author Jeff Fong
     * @description 角色列表，条件分页查询
     * @date 2023/7/5 10:54
     * @param: pageParam
     * @param: roleService
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.fckey.ttyx.model.acl.Role>
     **/
    @Override
    public IPage<Role> selectRolePage(Page<Role> pageParam, RoleQueryVo roleQueryVo) {
        // 获取条件值
        String roleName = roleQueryVo.getRoleName();
        // 构造查询对象
        LambdaQueryWrapper<Role> wrapper = new LambdaQueryWrapper<>();
        if(!StringUtils.isEmpty(roleName)){
            wrapper.like(Role::getRoleName, roleName);
        }
        // 调用方法查询
        Page<Role> rolePage = baseMapper.selectPage(pageParam, wrapper);
        return rolePage;
    }
}