package com.stackroute.dao;

import com.stackroute.model.User;

public interface UserDao {
	public void addUser(User user);
	public User getUserByNo(int userNo);
}
