package com.sample.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import com.sample.project.dao.IPersonDAO;
import com.sample.project.model.Person;

@ContextConfiguration(locations = "classpath:sample-model-app-context.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class PersonDAOTest {
	
	@Autowired
	private IPersonDAO pDAO;
	
	@Test
	@Transactional
	public void testAddPerson () {
		ApplicationContext context =  new ClassPathXmlApplicationContext(
				"sample-model-app-context.xml");
		IPersonDAO pDAO = (IPersonDAO) context.getBean("personDAO");
		pDAO.addPerson(new Person("test001", "001test"));
	}
}
