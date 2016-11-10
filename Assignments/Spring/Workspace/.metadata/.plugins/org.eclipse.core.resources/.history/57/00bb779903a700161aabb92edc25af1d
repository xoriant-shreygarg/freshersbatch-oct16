package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.AdvertiseDAO;
import com.spring.entity.Advertise;

public class AdvertiseServiceImpl implements AdvertiseService {

	@Autowired
	private AdvertiseDAO advertiseDao;
	
	public Advertise create(Advertise advertise) {
		return advertiseDao.create(advertise);
	}

}
