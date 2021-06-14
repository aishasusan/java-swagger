package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.dao.UserDao;
import com.stackroute.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@GetMapping("/")
	@ApiOperation(value="WELCOME USER MESSAGE")
	@ResponseBody
	public String welcomeUser() {
		return "******WELCOME USER IN SWAGGER******";
	}
	
	
	@PostMapping("/")
	public ResponseEntity<Void> welcome(@RequestBody User user){
		userDao.addUser(user);
		return new  ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/{no}")
	@ResponseBody
	@ApiOperation(value="GET USER DETAILS BY USER No")
	public ResponseEntity<User> getUserByNo(@PathVariable Integer no) {
		User userobj = userDao.getUserByNo(no);
		if(userobj==null) {
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<User>(userobj,HttpStatus.FOUND);
		}
	}
