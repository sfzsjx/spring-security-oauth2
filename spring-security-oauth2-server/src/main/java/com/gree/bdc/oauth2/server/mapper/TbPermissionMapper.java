package com.gree.bdc.oauth2.server.mapper;

import com.gree.bdc.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

/**
 * @author hadoop
 */
public interface TbPermissionMapper extends MyMapper<TbPermission> {
    /**
     * 查看用户拥有的所有权限
     * @param userId 用户id
     * @return List<TbPermission></>
     */
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}