package com.lingnan.usersys.user.business.service;

import com.lingnan.usersys.user.domain.UserVO;

/**
 * 用户service接口
 * @author Ring
 *
 */
public interface UserService {
	/**
	 * 注册用户/添加用户
	 * @param user 用户信息
	 * @return  用户信息
	 */
	//public boolean addUser(UserVO user);
	/**
	 * 用户登录
	 * @param userID  用户ID
	 * @param paswd 用户密码
	 * @return  用户信息
	 */
	public UserVO login(String userID,String paswd);

}
