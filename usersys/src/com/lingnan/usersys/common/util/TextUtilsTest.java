package com.lingnan.usersys.common.util;

import org.junit.Test;

public class TextUtilsTest {

	@Test
	public void testIsEmpty() {
		boolean flag = false;
		String str = "vdf";
		flag = TextUtils.isEmpty(str);
		if(flag)
			System.out.println("字符串为空");
		else
			System.out.println(str);
	}

}
