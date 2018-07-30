package com.lingnan.usersys.common.util;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class TypeUtilsTest {

	@Test
	public void testStrToDate() {
		System.out.println(TypeUtils.strToDate("2019-2-7"));
	}

	@Test
	public void testDateToStr() {
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = dateFormat1.parse("2009-06-01");
			System.out.println(TypeUtils.dateToStr(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testCheckEmail() {
		boolean flag = false;
		flag = TypeUtils.checkEmail("cwwdd@cds.com");
		if(flag)
			System.out.println("邮箱格式正确");
		else
			System.out.println("邮箱格式错误");
	}

}
