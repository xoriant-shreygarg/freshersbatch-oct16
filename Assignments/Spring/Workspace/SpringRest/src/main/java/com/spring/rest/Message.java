package com.spring.rest;

public class Message {

	private String message;
	private String postId;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + ", postId=" + postId + "]";
	}

	public Message() {
	}

}