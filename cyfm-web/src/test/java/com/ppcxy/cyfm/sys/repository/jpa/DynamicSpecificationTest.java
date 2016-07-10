/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.ppcxy.cyfm.sys.repository.jpa;

import com.ppcxy.cyfm.sys.repository.jpa.user.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DynamicSpecificationTest extends SpringTransactionalTestCase {

	@Autowired
	private UserDao userDao;

	//TODO WEEP searchFilter Test
	@Test
	public void fineUserByFilter() {
		// EQ
		//SearchFilter filter = new SearchFilter("name", Operator.EQ, "管理员");
		//List<User> users = userDao
		//		.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).hasSize(1);
        //
		//// LIKE
		//filter = new SearchFilter("username", Operator.LIKE, "min");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).hasSize(1);
        //
		//// GT
		//filter = new SearchFilter("id", Operator.GT, "1");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).hasSize(5);
        //
		//filter = new SearchFilter("id", Operator.GT, "6");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).isEmpty();
        //
		//// GTE
		//filter = new SearchFilter("id", Operator.GTE, "1");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).hasSize(6);
        //
		//filter = new SearchFilter("id", Operator.GTE, "6");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).hasSize(1);
        //
		//// LT
		//filter = new SearchFilter("id", Operator.LT, "6");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).hasSize(5);
        //
		//filter = new SearchFilter("id", Operator.LT, "1");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).isEmpty();
        //
		//// LTE
		//filter = new SearchFilter("id", Operator.LTE, "6");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).hasSize(6);
        //
		//filter = new SearchFilter("id", Operator.LTE, "1");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).hasSize(1);
        //
		//// Empty filters, select all
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(new ArrayList<SearchFilter>(), User.class));
		//assertThat(users).hasSize(6);
        //
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(null, User.class));
		//assertThat(users).hasSize(6);
        //
		//// AND 2 Conditions
		//SearchFilter filter1 = new SearchFilter("name", Operator.EQ, "管理员");
		//SearchFilter filter2 = new SearchFilter("username", Operator.LIKE, "min");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter1, filter2), User.class));
		//assertThat(users).hasSize(1);
        //
		//filter1 = new SearchFilter("name", Operator.EQ, "管理员");
		//filter2 = new SearchFilter("username", Operator.LIKE, "user");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter1, filter2), User.class));
		//assertThat(users).isEmpty();
        //
		//// 2 conditions on same field
		//filter1 = new SearchFilter("id", Operator.GTE, "1");
		//filter2 = new SearchFilter("id", Operator.LTE, "6");
        //
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter1, filter2), User.class));
		//assertThat(users).hasSize(6);
        //
		//// Nest Attribute
		//filter = new SearchFilter("team.id", Operator.EQ, "1");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).hasSize(6);
        //
		//filter = new SearchFilter("team.id", Operator.EQ, "10");
		//users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		//assertThat(users).isEmpty();
	}
}
