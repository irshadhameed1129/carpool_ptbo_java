package com.coresoft.springboot.CarPool.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coresoft.springboot.CarPool.domain.User;
import com.coresoft.springboot.CarPool.handler.JsonLoginHandler;
import com.coresoft.springboot.CarPool.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userProfileServices;
	
//	@CrossOrigin(origins= "http://localhost:3000")
	@CrossOrigin(origins= "https://car-pool-ptbo-react.herokuapp.com")
	@GetMapping( "/userlist")
	public List<User> fetchProductList () {
		List<User> products= new ArrayList<User>();
		//fetch data from database;
		products = userProfileServices.fetchUserList();
		return products;
	}
	

//	@CrossOrigin(origins= "http://localhost:3000")
	@CrossOrigin(origins= "https://car-pool-ptbo-react.herokuapp.com")
	@PostMapping( "/registration")
	@ResponseBody
	public User saveUser (@RequestBody User user) {
		try {
			User savedUser = null;
//			if(userProfileServices.findByEmail(user.getEmail()) == null) {
			savedUser = userProfileServices.saveNewUser(user);
			 if (savedUser != null ) {
				 System.out.println("Saved User" +savedUser);
				 return savedUser;
			 }
			 else return savedUser;
//			}
//			else return null;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			return null;
	}
//	@CrossOrigin(origins= "http://localhost:3000")
	@CrossOrigin(origins= "https://car-pool-ptbo-react.herokuapp.com")
	@PostMapping( "/login")
	@ResponseBody
	public User validateUser (@RequestBody JsonLoginHandler handler) {
//		System.out.println(handler);
		User user= null;
		
			//fetch data from database using email and pass;
			user = userProfileServices.findByEmailPass(handler.getEmail(), handler.getPass());
		
		
			
			return user;
		
			 
	}
	
	
//	@CrossOrigin(origins= "http://localhost:3000")
	@CrossOrigin(origins= "https://car-pool-ptbo-react.herokuapp.com")
	@PostMapping( "/update")
	@ResponseBody
	public User  updateUser (@RequestBody User user) {
//		System.out.println(handler);
		User updated = null;
		User newUser = null;
		int r=15;
			//fetch data from database using email and pass;
		newUser = userProfileServices.findById(user.getId());
			System.out.println(user.getId());
			if (newUser!=null ) {
				if (user.getPass() == "") {
					user.setPass(newUser.getPass());
				}
				
				if(user.getMobile() =="") {
					user.setMobile(newUser.getMobile());
				}
//				r = userProfileServices.updateUser(user);
//				updated = userProfileServices.saveNewUser(user);
				updated = userProfileServices.saveNewUser(user);
				System.out.println("inside usercon" + r);
				return updated;
			} else {
				
			}
		
		
			
			return null;
		
			 
	}

	

	
}
