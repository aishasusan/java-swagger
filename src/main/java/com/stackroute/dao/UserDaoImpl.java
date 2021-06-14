package com.stackroute.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.stackroute.model.User;


@Repository
public class UserDaoImpl implements UserDao{

	private static List<User> users = new ArrayList<User>();
	
	
	@Override
	public void addUser(User user) {
		users.add(user);
		
	}

	@Override
	public User getUserByNo(int userNo) {
		for(User u : users) {
			if(u.getUserNO()==userNo) {
				return u;
			}
		}
		
		
		return null;
	}

}
