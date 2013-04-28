package com.sample.project.dao.simple;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.sample.project.model.Person;

public class HibernateUtils
{
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    static
    {
        try
        {
            Configuration configuration = new Configuration().configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        catch (HibernateException he)
        {
            System.err.println("Error creating Session: " + he);
            throw new ExceptionInInitializerError(he);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    } 
}

//public class HibernateUtils 
//{ 
//    private static final Session session; 
//
//    static { 
//        try { 
//            // Create the SessionFactory from hibernate.cfg.xml 
//        	Configuration configuration = new Configuration();
//        	configuration.configure("hibernate_sp.cfg.xml");
//        	ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
//        	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistryBuilder.buildServiceRegistry());
//        	session = sessionFactory.openSession();
//        } catch (Throwable ex) { 
//            // Make sure you log the exception, as it might be disallowed 
//            System.err.println("Initial SessionFactory creation failed." + ex); 
//            throw new ExceptionInInitializerError(ex); 
//        } 
//    } 
//
//    public static Session getSession() { 
//        return session; 
//    } 
//
//} 
