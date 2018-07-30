package com.lingnan.usersys.common.util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.lingnan.usersys.common.exception.DateException;
import com.lingnan.usersys.common.exception.EmailException;



/**
 * 
 * @author Ring
 *
 */
public class TypeUtils 
{
	/**
	 * 字符串转换为日期
	 * @param str 指定的字符串
	 * @return    转换后的日期
	 */
	public static Date strToDate(String str) 
	{
		Date date = null;
		//设置要格式化的日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// 将异常封装为自定义异常
			throw new DateException("字符串转换为日期出错",e);
			//e.printStackTrace();
		}
		//返回转换后的值
		return date;
	}
	
	/**
	 * 日期转换为字符串
	 * @param date  指定的日期
	 * @return      转换后的字符串
	 */
	public static String dateToStr(Date date) 
	{
		String str = null;
		try{
			//设置要格式化的日期格式
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//调用format方法，将日期格式转换成字符串
			str = sdf.format(date);
		}catch (Exception e) {
			// 将异常封装为自定义异常
			throw new DateException("日期转换为字符串出错",e);
			//e.printStackTrace();
		}
		//返回转换后的值
		return str;
	}
	
	
	/**
	 * 检查邮箱格式
	 * @param email 指定的邮箱
	 * @return      邮箱格式是否正确
	 */
	public static boolean checkEmail(String email) 
	{
		try{
			String mail = email.replaceAll("^[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", "");
			if(mail.length()==0){
				return true;
			}else{
				System.out.println("邮箱格式错误");
				return false;
			}
		}catch (Exception e){
			throw new EmailException("邮箱格式错误",e);
		}		
	}
}
