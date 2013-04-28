package com.sample.project.dao;

import org.hibernate.SessionFactory;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.sample.project.model.Person;

public interface IPersonDAO extends GenericDAO<Person, Long> {
	public void addPerson(Person p);
	public SessionFactory getSessionFactory();
}
