package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Booking;

public interface BookingService {
	
	public boolean addBooking(Booking booking);
	public List<Booking> getBooking();

}
