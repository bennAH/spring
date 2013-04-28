package com.sample.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.project.model.Person;

@Service
@Transactional
public class PersonService implements IPersonService{

	IPersonDAO personDAO;

	@Autowired
	public void setPersonDAO(IPersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	public void save(Person p) {
		personDAO.save(p);
	}
}
