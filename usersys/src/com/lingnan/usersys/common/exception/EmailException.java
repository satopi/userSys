package com.lingnan.usersys.common.exception;

/**
 * service异常类
 * @author Ring
 *
 */
@SuppressWarnings("serial")
public class EmailException extends ServiceException
{
	/**
	 * 默认的构造方法
	 */
	public EmailException(){
	}
	
	/**
	 * 构造方法
	 * @param arg0 异常的详细信息
	 */
	public EmailException(String arg0){
		super(arg0);
	}
	
	/**
	 * 构造方法
	 * @param arg0 产生异常的原因
	 */
	public EmailException(Throwable arg0){
		super(arg0);
	}
	
	/**
	 * 构造方法
	 * @param arg0 异常的详细原因
	 * @param arg1 产生异常的原因
	 */
	public EmailException(String arg0, Throwable arg1){
		super(arg0,arg1);
	}
}
