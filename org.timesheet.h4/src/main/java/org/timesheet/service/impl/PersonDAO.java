package org.timesheet.service.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.timesheet.domain.Person;
import org.timesheet.service.dao.IPersonDAO;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

@Transactional(propagation= Propagation.SUPPORTS, readOnly=false)
@Repository
public class PersonDAO extends GenericDAOImpl<Person, Long> implements IPersonDAO {

//	@Transactional
	@Override
	public void addPerson(Person p) {
		this.save(p);
	}
	
	@Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
            super.setSessionFactory(sessionFactory);
    }
	
	public SessionFactory getSessionFactory () {
		return super.getSessionFactory();
	}

}
