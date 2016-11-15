package com.spring.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADVERTISE")
public class Advertisement {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name = "POST_ID")
	private String postId;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "NAME")
	private String name;

	@Column(name = "POSTED_BY")
	private String postedByUsername;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
//	@Column(name = "ID")
//	private ArrayList<String> photos; //multipart

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

//	public ArrayList<String> getPhotos() {
//		return photos;
//	}
//
//	public void setPhotos(ArrayList<String> photos) {
//		this.photos = photos;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostedByUsername() {
		return postedByUsername;
	}

	public void setPostedByUsername(String postedByUsername) {
		this.postedByUsername = postedByUsername;
	}

	@Override
	public String toString() {
		return "Advertisement [id=" + id + ", postId=" + postId + ", status=" + status + ", title=" + title + ", name="
				+ name + ", postedByUsername=" + postedByUsername + ", category=" + category + ", description="
				+ description + "]";
	}

	public Advertisement() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getTitle().equals(((Advertisement)obj).getTitle());
	}
	
}