package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.Advertise;

public class AdvertiseDAOImpl implements AdvertiseDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Advertise create(Advertise advertise) {
		hibernateTemplate.save(advertise);
		return advertise;
	}
}
