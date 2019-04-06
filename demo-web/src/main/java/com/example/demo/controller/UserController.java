package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/findAllUser")
	public List<User> findAllUser(){
		//return userService.findAllUser();
		return userService.findAllUser();
	}
	
	@RequestMapping(value="/findUserById/{id}",method=RequestMethod.GET)
	public User findUserById(@PathVariable Integer id){
		System.out.println(id);
		return new User();
	}
	
}
