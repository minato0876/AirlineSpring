package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	EntityManager eMan;

	@Override
	public boolean addFlight(Admin admin) {
		// TODO Auto-generated method stub
		eMan.persist(admin);
		return true;
	}

	@Override
	public List<Admin> getFlight() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from Admin").getResultList();
	}

	

	@Override
	public boolean deleteVehicle(String flightno) {
		
		Admin obj=eMan.find(Admin.class, flightno);
		eMan.remove(obj);
		return true;
	}
	
	
}
