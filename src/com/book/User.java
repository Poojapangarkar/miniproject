package com.book;

import com.book.User.UserType;

public class User {
	
	
	enum UserType{
		USER,ADMIN
	}
	
	private String userName;
	private String password;
	private UserType Type;
	
	
	public User(String userName, String password, UserType type) {
		super();
		this.userName = userName;
		this.password = password;
		Type = type;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserType getType() {
		return Type;
	}


	public void setType(UserType type) {
		Type = type;
	}


	
	
	
	

}
