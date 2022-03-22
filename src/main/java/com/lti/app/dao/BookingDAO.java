package com.lti.app.dao;

import java.util.List;

import com.lti.app.pojo.Booking;

public interface BookingDAO {
	
	public boolean addBooking(Booking booking);
	public List<Booking> getBooking();

}
