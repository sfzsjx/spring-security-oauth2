package com.gree.bdc.oauth2.server.service.impl;

import com.gree.bdc.oauth2.server.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gree.bdc.oauth2.server.mapper.TbPermissionMapper;
import com.gree.bdc.oauth2.server.service.TbPermissionService;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUseId(Long userId) {

        return tbPermissionMapper.selectByUserId(userId);
    }
}
