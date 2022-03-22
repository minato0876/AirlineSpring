package com.lti.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.dao.CustomerDetailsDAO;
import com.lti.app.pojo.CustomerDetails;

@Service
@Transactional
public class CustomerDetailsServiceImpl implements CustomerDetailsService{

	@Autowired
	CustomerDetailsDAO vdao;
	
	@Override
	public boolean addBooking(CustomerDetails book) {
		// TODO Auto-generated method stub
		return vdao.addBooking(book);
	}

	@Override
	public List<CustomerDetails> getBooking() {
		// TODO Auto-generated method stub
		return vdao.getBooking();
	}

}
