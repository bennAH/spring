package com.sample.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.sample.project.model.Person;

 
public class MyDAO {
     
    private SessionFactory sessionFactory;
         
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    @Transactional(readOnly=false)
    public void addPerson(Person p) {
        Session session = sessionFactory.openSession();
        session.save(p);
        session.close();       
    }
}
