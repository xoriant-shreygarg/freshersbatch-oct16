package com.spring.rest;

import java.util.ArrayList;

public class Advertisement {

	private String postId;
	private String status;
	private String title;
	private String name;
	private String postedByUsername;
	private String category;
	private String description;
	private ArrayList<String> photos; //multipart

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<String> getPhotos() {
		return photos;
	}

	public void setPhotos(ArrayList<String> photos) {
		this.photos = photos;
	}

	public String getPostedByUsername() {
		return postedByUsername;
	}

	public void setPostedByUsername(String postedByUsername) {
		this.postedByUsername = postedByUsername;
	}

	@Override
	public String toString() {
		return "Advertisement [postId=" + postId + ", status=" + status + ", title=" + title + ", name=" + name
				+ ", postedByUsername=" + postedByUsername + ", category=" + category + ", description=" + description
				+ ", photos=" + photos + "]";
	}

	public Advertisement() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getTitle().equals(((Advertisement)obj).getTitle());
	}

}