package com.techbirds.mybatis.dao;

import java.io.Reader;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.techbirds.mybatis.vo.User;

public class UserDaoTest {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}
	
	@Test
	public void testQueryUserById() {
		SqlSession session=getSession().openSession();
		//方式一
//		User user=session.selectOne("com.techbirds.mybatis.dao.UserMapper.QueryUserById",11);
//		System.out.println(user.toString());
		
		//方式二
		UserMapper userMapper=session.getMapper(UserMapper.class);
		try {
			System.out.println(userMapper.QueryUserById(11).toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
