package com.techbirds.mybatis.dao;

import java.sql.SQLException;
import java.util.List;

import com.techbirds.mybatis.vo.User;

public interface UserMapper {
	//查询用户集合  
    public List<User> QueryUserList()throws SQLException;  
    //根据id查询用户  
    public User QueryUserById(int id)throws SQLException;  
    //添加新用户  
    public void AddUser(User user) throws SQLException;  
    //修改用户信息  
    public int UpdateUser(User user) throws SQLException;  
    //删除用户  
    public void DeleteUserById(int id) throws SQLException;
}
