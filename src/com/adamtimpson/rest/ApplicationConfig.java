package com.adamtimpson.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.core.Application;

import com.adamtimpson.rest.entrypoint.UserEntry;

@ApplicationPath("/rest")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		// DO NOT TOUCH THIS - IT WORKS
		
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(UserEntry.class);
		return classes;
	}
	
}
