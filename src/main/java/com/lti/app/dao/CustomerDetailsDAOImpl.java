package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.CustomerDetails;
import com.lti.app.pojo.Flight;

@Repository
public class CustomerDetailsDAOImpl implements CustomerDetailsDAO{

	@Autowired
	EntityManager eMan;

	@Override
	public boolean addBooking(CustomerDetails booking) {
		// TODO Auto-generated method stub
		eMan.persist(booking);
		return true;
	}

	@Override
	public List<CustomerDetails> getBooking() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from Booking").getResultList();
	}
	
	

}
