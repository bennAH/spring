package com.sample.project.dao.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.sample.project.dao.CitizenService;
import com.sample.project.dao.IPersonDAO;
import com.sample.project.dao.IPersonService;
import com.sample.project.dao.MyDAO;
import com.sample.project.model.Citizen;
import com.sample.project.model.Person;

public class Test {


	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext(
				"sample-model-app-context.xml");
		
//		for(String bs : context.getBeanDefinitionNames()) {
//			System.out.println(bs + ": " + context.getBean(bs));
//		}
		
		IPersonDAO pDAO = (IPersonDAO) context.getBean("personDAO");
		
		HibernateTransactionManager htm = (HibernateTransactionManager) context.getBean("transactionManager");
		TransactionDefinition def = new DefaultTransactionDefinition();
	    TransactionStatus status = htm.getTransaction(def);
	    for (int i = 0; i < 10; i++) {
	    	pDAO.save(new Person("fname" + i, "lname" + i ));
	    }
		htm.commit(status);
		
//		working(context);

		
	}
	
	static void working(ApplicationContext context) {
		
		IPersonService ps = (IPersonService) context.getBean("personService");
		Person person2 = new Person("name002", "last002");
		ps.save(person2);
		
		CitizenService cs = (CitizenService) context.getBean("citizenServiceImpl");
		Citizen c = new Citizen("ben", "superman");
		cs.save(c);
		
		MyDAO dao = (MyDAO) context.getBean("myDAO");
		Person person = new Person("name001","last001");
		dao.addPerson(person);
	}

}
