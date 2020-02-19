package com.gree.bdc.oauth2.server.mapper;

import com.gree.bdc.oauth2.server.domain.TbUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

/**
 * @author hadoop
 */
@Repository
public interface TbUserMapper extends MyMapper<TbUser> {
}