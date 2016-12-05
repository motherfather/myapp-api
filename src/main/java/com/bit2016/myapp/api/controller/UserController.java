package com.bit2016.myapp.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit2016.myapp.domain.User;
import com.bit2016.myapp.service.UserService;

@Controller
@RequestMapping( "/api/user" )
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping( "/list" )
	@ResponseBody
	public Object checkEmail() {
		
		List<User> list = userService.getAllUsers();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put( "result", "success" );
		map.put( "data", list );
		
		return map;
	}
}
