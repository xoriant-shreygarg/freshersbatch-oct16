package com.spring.service;

import java.util.List;

import com.spring.entity.Advertisement;
import com.spring.entity.Message;
import com.spring.entity.User;

public interface AdvertisementService {
	public Advertisement create(Advertisement advertisement);
	public String login(User user);
	public String register(User user);
	public User getUser(int id);
	public String updateAd(int id, Advertisement advertisement);
	public List<Advertisement> getAdvertisements();
	public Advertisement getPost(int id);
	public String deleteAd(int id);
	public Advertisement viewAd(int id);
	public String message(Message message);
	public List<String> getCategories();
	public List<String> getActions();
}