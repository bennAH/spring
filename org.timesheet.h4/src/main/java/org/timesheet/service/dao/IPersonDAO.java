package org.timesheet.service.dao;

import org.hibernate.SessionFactory;
import org.timesheet.domain.Person;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;


public interface IPersonDAO extends GenericDAO<Person, Long> {
	public void addPerson(Person p);
	public SessionFactory getSessionFactory();
}
