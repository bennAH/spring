package com.sample.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

@ContextConfiguration(locations = "classpath:sample-model-app-context.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public abstract class BaseTest extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private HibernateTransactionManager transactionManager;
	
	@BeforeMethod
	public void setUpDBContext () {
		Assert.assertNotNull(transactionManager);
		TransactionDefinition def = new DefaultTransactionDefinition();
	    transactionManager.getTransaction(def);
	}
	
}
