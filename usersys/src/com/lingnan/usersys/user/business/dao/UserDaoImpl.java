package com.lingnan.usersys.user.business.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lingnan.usersys.common.exception.DaoException;
import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.user.domain.UserVO;

/**
 * 用户dao接口的实现类
 * @author Ring
 *
 */
public class UserDaoImpl implements UserDao
{
	/**
	 * 数据库连接
	 */
	private Connection conn;
	
	/**
	 * 构造方法
	 * 
	 * @param conn 数据库连接
	 */
	public UserDaoImpl(Connection conn){
		//给属性赋初始化值
		this.conn = conn;
	}
	
	/**
	 * 用户登录
	 * @param user 用户信息
	 * @return  用户信息
	 */
	public UserVO login(String userID,String paswd)
	{
		//声明结果集对象变量，用于保存数据库查询结果
		ResultSet rs = null;
		//声明预编译的声明对象变量，用于进行数据库操作的载体
		PreparedStatement pstam = null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		UserVO user = null;		
		try {
			//调用连接对象prepareStatement方法，得到预编译对象，赋值给预编译对象变量
			pstam = conn.prepareStatement("select*from t_user where userID=? and paswd=?");
			//调用预编译对象的setxxx方法，给？赋值
			pstam.setString(1, userID);
			pstam.setString(2, paswd);
			//调用预编译对象的executeQuery方法，执行查询操作，返回查询结果，赋值给结果集对象变量
			rs = pstam.executeQuery();
			//如果查询结果不为空，将取出结果集中的各个字段，封装在用户对象的各个属性中
			if(rs.next()){
				//创建一个新用户对象，赋值给用户对象变量
				user = new UserVO();
				user.setAdminID(rs.getInt("adminID"));
				user.setUserID(rs.getString("userID"));
				user.setPaswd(rs.getString("paswd"));
				user.setAuthority(rs.getString("authority"));
				user.setMail(rs.getString("mail"));
				user.setBirth(rs.getDate("birth"));
			}
		} 
		//如果出现异常，输出异常信息
		catch (SQLException e) {
			System.out.println("在插入用户时出错，错误信息是："+e.getMessage());
			// 将异常封装成自定义异常
			throw new DaoException("登录时查询数据出错",e); 
		}finally{
			//调用数据库工具类，关闭结果集对象和声明对象
			DBUtils.closeStatement(rs, pstam);
		}
		return user;		
	}
}
