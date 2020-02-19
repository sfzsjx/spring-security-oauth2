package com.gree.bdc;

import com.gree.bdc.oauth2.server.domain.TbUser;
import com.gree.bdc.oauth2.server.mapper.TbUserMapper;
import com.gree.bdc.oauth2.server.service.TbUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

public class MybatisTest {

        @Autowired
        TbUserMapper tbUserMapper;

        @Test
        public void  test(){
            Example example = new Example(MybatisTest.class);
            example.createCriteria().andEqualTo("username","admin");
            System.out.println(tbUserMapper.selectOneByExample(example));

        }

}
