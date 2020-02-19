package com.gree.bdc.oauth2.server.service;

import com.gree.bdc.oauth2.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService{
    List<TbPermission> selectByUseId(Long userId);
}
