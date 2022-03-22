package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.CustomerDetails;

public interface CustomerDetailsService {
	
	public boolean addBooking(CustomerDetails booking);
	public List<CustomerDetails> getBooking();

}
