package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private static List<User> users = new ArrayList<>();
	
	static{
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setId(String.valueOf(i));
			user.setName("user_"+i);
			user.setAge(i);
			users.add(user);
		}
	}

	@Override
	public List<User> findAllUser() {
		return users;
	}

}
