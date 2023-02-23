package org.tech.kshitij.Repository.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tech.kshitij.Common.DummyUserDB;
import org.tech.kshitij.Model.User;
import org.tech.kshitij.Repository.UserRepository;

@Repository("userRepository")
public class UserRepoImpl implements UserRepository {

	
	@Autowired
	private DummyUserDB userDB;
	@SuppressWarnings("static-access")
	@Override
	public User userGetRepo(String id) {
		return (User)userDB.getInstance().map.get(id);
		
	}
	@SuppressWarnings("static-access")
	@Override
	public User userAddRepo(User user) {
		return (User)userDB.getInstance().map.put(user.getId(),user);
		
	}
	@SuppressWarnings("static-access")
	@Override
	public User userUpdateRepo(String id, User user) {
		return (User)userDB.getInstance().map.put(user.getId(),user);
	}
	@SuppressWarnings("static-access")
	@Override
	public User userRemoveRepo(String id) {
		return "User : "+ id +"successfully deleted from dummy DB";
	}

}
