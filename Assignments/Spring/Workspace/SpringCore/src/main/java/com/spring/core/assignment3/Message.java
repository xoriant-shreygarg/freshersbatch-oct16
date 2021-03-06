package com.spring.core.assignment3;

public class Message {
	
	private User sender;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public Message() {
		super();
	}


	@Override
	public String toString() {
		return "\n\t\t\t"+sender.getName() + ": " + message;
	}

	public Message(User sender, String message) {
		super();
		this.sender = sender;
		this.message = message;
	}

}
