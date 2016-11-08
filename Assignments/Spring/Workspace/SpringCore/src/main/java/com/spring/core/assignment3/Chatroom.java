package com.spring.core.assignment3;

import java.util.List;
import java.util.Set;

class Chatroom {
	
	private String name;
	private Set<User> users;
	private List<Message> messages;

	public Chatroom() {
		super();
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chatroom(String name, Set<User> users, List<Message> messages) {
		super();
		this.name = name;
		this.users = users;
		this.messages = messages;
	}
	
	@Override
	public String toString() {
		return "Chatroom: "+name+" \n\tUsers: " + users + "\n\t\t Messages: " + messages + "\n";
	}
	
}