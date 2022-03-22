package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.CustomerDetails;
import com.lti.app.service.CustomerDetailsService;
import com.lti.app.service.FlightService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class CustomerDetailsController {
	
	@Autowired
	CustomerDetailsService vService;
	
	@GetMapping("/booking")
	public List<CustomerDetails> getBooking()
	{
		return vService.getBooking();
	}

	@PostMapping("/booking")
	public boolean addBooking(@RequestBody CustomerDetails booking)
	{
		System.out.println(booking);
		return vService.addBooking(booking);
	}
}
