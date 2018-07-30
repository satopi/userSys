package com.lingnan.usersys.user.domain;

import java.util.Date;

/**
 * 用户信息类
 * @author Ring
 *
 */
public class UserVO
{
	private int adminID;           //主键
	private String userID;      //用户ID
	private String paswd;     //密码
	private String authority;     //权限
	private String mail;      //邮箱
	private Date birth;     //生日
	
	/**
	 * 获取用户编号、id、密码、权限、邮箱和生日
	 * @return 用户编号、id、密码、权限、邮箱和生日
	 */
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPaswd() {
		return paswd;
	}
	public void setPaswd(String paswd) {
		this.paswd = paswd;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}	
}
