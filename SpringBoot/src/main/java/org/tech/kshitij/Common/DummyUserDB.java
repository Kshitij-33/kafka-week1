package org.tech.kshitij.Common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class DummyUserDB {

	public static DummyUserDB userDB=null;
	
	public Map<String,Object> map;
	
	private DummyUserDB(){
		map = new HashMap<String,Object>();
		
		
	}
	public static DummyUserDB getInstance()
	{
		if(userDB==null)
			userDB=new DummyUserDB();
		return userDB;
		
	}
	
}
