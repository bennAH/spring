package com.sample.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sample.project.dao.IPersonDAO;
import com.sample.project.model.Person;

public class PersonDAOTest extends BaseTest{
	
	@Autowired
	private IPersonDAO pDAO;
	
	@BeforeMethod
	public void setUp () {
		System.out.println("=============Here===============");
	}
	
	@Test
	@Transactional
	public void testAddPerson () {
		pDAO.addPerson(new Person("test001", "001test"));
		Assert.assertEquals(1, pDAO.findAll().size());
	}
}
