package com.sample.project.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sample.project.model.Person;

@Repository
public class PersonDAO extends BaseDAO<Person, Long> implements IPersonDAO {

//	@Transactional
	@Override
	public void addPerson(Person p) {
		this.save(p);
	}

}
