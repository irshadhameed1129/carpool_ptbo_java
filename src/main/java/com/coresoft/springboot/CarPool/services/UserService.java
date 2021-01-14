package com.coresoft.springboot.CarPool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coresoft.springboot.CarPool.Repository.UserRepository;
import com.coresoft.springboot.CarPool.domain.User;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveNewUser(User userProfile) {
		return userRepository.save(userProfile);
	}
	public User findByEmailPass(String email, String pass) {
		try {
			return userRepository.findByEmailPass(email,pass);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception" + e);
		}
		return null;
	}
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User findById(int id) {
		return userRepository.findById(id);
	}
	
	public User findByEmailMobile(String email, String mobile) {
		return userRepository.findByEmailMobile(email,mobile);
	}
	
	public int updateUser(User user) {
		System.out.println("service");
		return userRepository.update(user.getMobile(), user.getPass(), user.getId());
	}
	
	public List<User> fetchUserList() {
		return userRepository.findAll();
	}
	
	

}
