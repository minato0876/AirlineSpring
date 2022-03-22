package com.lti.app.dao;

import java.util.List;

import javax.persistence.*;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	EntityManager eMan;
	
	@Override
	public List<User> validateUser() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from User").getResultList();
	}

	@Override
	public List<User> validateAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		eMan.persist(user);
		return true;
	}

	@Override
	public boolean validateLogin(String username, String password) {
		// TODO Auto-generated method stub
		
		Query qry2= eMan.createQuery("from User r where r.username=?1 and r.password=?2");
		qry2.setParameter(1, username);
		qry2.setParameter(2, password);
		List<User> r2=qry2.getResultList();
		if(r2.size()>0)
		return true;
		else
			return false;
		
	}

	@Override
	public boolean validateAdmin(String title, String username, String password) {
		Query qry2= eMan.createQuery("from User r where r.title=?1 and r.username=?2 and r.password=?3");
		qry2.setParameter(1, title);
		qry2.setParameter(2, username);
		qry2.setParameter(3, password);
		List<User> r2=qry2.getResultList();
		if(r2.size()>0)
		return true;
		else
			return false;
	}

}