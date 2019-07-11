package com.adamtimpson.rest.entrypoint;

import java.util.ArrayList;
import java.util.List;

import com.adamtimpson.db.DatabaseConnection;
import com.adamtimpson.rest.model.UserModel;

public class UserEntry {
	
	private DatabaseConnection db;
	
	public UserEntry() {
		db = new DatabaseConnection();
		db.initDb(); // Should be accessed in a static way?? 
	}
	
	public List<UserModel> getAllUsers() {
		List models = new ArrayList<UserModel>();
		
		
		
		return models;
	}
	
}
