package org.tech.kshitij.Service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech.kshitij.Model.User;
import org.tech.kshitij.Repository.UserRepository;
import org.tech.kshitij.Service.Userservice;

@Service("userService")
public class UserServiceImpl implements Userservice {

	@Autowired
	private UserRepository userRepository;
	
	public User userGetServ(String id) {
		return userRepository.userGetRepo(id);
	}

	@Override
	public User userAddServ(User user) {
		
		return userRepository.userAddRepo(user);
	}

	@Override
	public User userUpdateServ(String id, User user) {
		
		return userRepository.userUpdateRepo(id,user);
	}

	@Override
	public User userRemoveServ(String id) {
		
		return userRepository.userRemoveRepo(id);
	}

	
}
