package org.tech.kshitij.Service;

import org.tech.kshitij.Model.User;

public interface Userservice {

	public User userGetServ(String id);
	
	public User userAddServ(User user);
	
	public User userUpdateServ(String id,User user);
	
	public User userRemoveServ(String id);
}
