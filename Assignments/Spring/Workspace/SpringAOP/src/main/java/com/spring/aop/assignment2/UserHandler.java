package com.spring.aop.assignment2;

import java.util.ArrayList;

public class UserHandler {
	
	static boolean isUserLoggedIn;
	static ArrayList<User> users = new ArrayList<User>();
	static User userLoggedIn;
	static long sessionTime;
	
	public void login(String username, String password) throws MyException{
		for (User user : users) {
			if(user.getLoginname().equals(username)&&user.getPassword().equals(password)){
				userLoggedIn = user;
				isUserLoggedIn = true;
				sessionTime = System.currentTimeMillis();
			}
		}
	} 
	
	public void logout() throws MyException{
		System.out.println("Logged out");
		userLoggedIn = null;
		isUserLoggedIn = false;
		System.out.println("Session time: "+(System.currentTimeMillis() - sessionTime));
	} 
	
	public void register(String loginname, String password, String firstname, String country) throws MyException{
		users.add(new User(loginname, password, firstname, country));
		System.out.println("Registered");
	} 
	
	public UserHandler(){}

}