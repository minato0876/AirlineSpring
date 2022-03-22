package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Booking;
import com.lti.app.pojo.Flight;

@Repository
public class BookingDAOImpl implements BookingDAO{

	@Autowired
	EntityManager eMan;

	@Override
	public boolean addBooking(Booking booking) {
		// TODO Auto-generated method stub
		eMan.persist(booking);
		return true;
	}

	@Override
	public List<Booking> getBooking() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from Booking").getResultList();
	}
	
	

}
