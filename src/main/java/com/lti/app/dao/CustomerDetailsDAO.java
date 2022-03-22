package com.lti.app.dao;

import java.util.List;

import com.lti.app.pojo.CustomerDetails;

public interface CustomerDetailsDAO {
	
	public boolean addBooking(CustomerDetails booking);
	public List<CustomerDetails> getBooking();

}
