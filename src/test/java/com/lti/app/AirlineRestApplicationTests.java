package com.lti.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.app.dao.AdminDAO;
import com.lti.app.pojo.Passenger;
import com.lti.app.service.AdminService;

@SpringBootTest
class AirlineRestApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	AdminService vService;
	
	@Test
	void testAddFlight()
	{
		Passenger p1=new Passenger(1, "user", "a", "a"," a"," 1234567Aa","null", "1", 1234567891);
	}
	
	

}
