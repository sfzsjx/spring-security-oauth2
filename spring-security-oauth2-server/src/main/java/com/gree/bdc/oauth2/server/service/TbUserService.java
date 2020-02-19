package com.gree.bdc.oauth2.server.service;

import com.gree.bdc.oauth2.server.domain.TbUser;

public interface TbUserService{
    TbUser getUserByName(String username);
}
