package org.tech.kshitij.Repository;

import org.tech.kshitij.Model.User;

public interface UserRepository {

	

	public User userGetRepo(String id);
	
	public User userAddRepo(User user);
	
	public User userUpdateRepo(String id,User user);
	
	public User userRemoveRepo(String id);
}
