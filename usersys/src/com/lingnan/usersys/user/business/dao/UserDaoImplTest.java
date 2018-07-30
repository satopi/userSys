package com.lingnan.usersys.user.business.dao;

import java.sql.Connection;

import org.junit.Test;

import com.lingnan.usersys.common.util.DBUtils;

public class UserDaoImplTest {

	@Test
	public void testUserDaoImpl() {
		
	}

	@Test
	public void testLogin() {
		Connection conn = DBUtils.getConnection();
		UserDaoImpl s = new UserDaoImpl(conn);
		s.login("U01", "U01");
	}
}
