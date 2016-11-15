package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MESSAGE")
public class Message {

	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;


	@Column(name = "MESSAGE")
	private String message;
	

	@Column(name = "POST_ID")
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", postId=" + postId + "]";
	}

	public Message() {
		super();
	}

}