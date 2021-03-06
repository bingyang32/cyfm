/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.ppcxy.cyfm.sys.repository.mybatis;

import com.google.common.collect.Maps;
import com.ppcxy.cyfm.showcase.data.UserData;
import com.ppcxy.cyfm.sys.entity.user.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@DirtiesContext
@ContextConfiguration(locations = {"/applicationContext.xml", "/applicationContext-cyfm.xml"})
public class UserMybatisDaoTest extends SpringTransactionalTestCase {
    
    @Autowired
    private UserMybatisDao userDao;
    
    @Test
    public void getUser() throws Exception {
        User user = userDao.get(1L);
        assertThat(user).as("User not found").isNotNull();
        assertThat(user.getUsername()).isEqualTo("admin");
    }
    
    @Test
    public void searchUser() throws Exception {
        Map<String, Object> parameter = Maps.newHashMap();
        parameter.put("name", "管理员");
        List<User> result = userDao.search(parameter);
        assertThat(result).hasSize(1);
        assertThat(result.get(0).getUsername()).isEqualTo("admin");
    }
    
    @Test
    public void createAndDeleteUser() throws Exception {
        // create
        int count = countRowsInTable("cy_sys_user");
        User user = UserData.randomUser();
        userDao.save(user);
        Long id = user.getId();
        
        assertThat(countRowsInTable("cy_sys_user")).isEqualTo(count + 1);
        User result = userDao.get(id);
        assertThat(result.getUsername()).isEqualTo(user.getUsername());
        
        // delete
        userDao.delete(id);
        assertThat(countRowsInTable("cy_sys_user")).isEqualTo(count);
        assertThat(userDao.get(id)).isNull();
    }
    
}
