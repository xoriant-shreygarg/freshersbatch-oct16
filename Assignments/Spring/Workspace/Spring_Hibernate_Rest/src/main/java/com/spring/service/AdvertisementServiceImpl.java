package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.AdvertisementDAO;
import com.spring.entity.Advertisement;
import com.spring.entity.Message;
import com.spring.entity.User;

public class AdvertisementServiceImpl implements AdvertisementService {

	@Autowired
	private AdvertisementDAO advertisementDao;
	
	public Advertisement create(Advertisement advertise) {
		return advertisementDao.create(advertise);
	}

	public String login(User user) {
		return advertisementDao.login(user);
	}

	public String register(User user) {
		return advertisementDao.register(user);
	}

	public User getUser(int id) {
		return advertisementDao.getUser(id);
	}

	public String updateAd(int id, Advertisement advertisement) {
		return advertisementDao.updateAd(id,advertisement);
	}

	public List<Advertisement> getAdvertisements() {
		return advertisementDao.getAdvertisements();
	}

	public Advertisement getPost(int id) {
		return advertisementDao.getPost(id);
	}

	public String deleteAd(int id) {
		return advertisementDao.deleteAd(id);
	}

	public Advertisement viewAd(int id) {
		return advertisementDao.viewAd(id);
	}

	public String message(Message message) {
		return advertisementDao.message(message);
	}

	public List<String> getCategories() {
		return advertisementDao.getCategories();
	}

	public List<String> getActions() {
		return advertisementDao.getActions();
	}

}