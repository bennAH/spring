package com.sample.project.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sample.project.data.model.Person;
import com.sample.project.data.repository.PersonRepository;

@ContextConfiguration(locations="classpath:META-INF/sample-data-test-context.xml")
public class PersonRepositoryTest extends AbstractTestNGSpringContextTests{
	
	@Autowired
	PersonRepository personRepository;
	
	@Test
	public void test() {
		Person p = new Person("ben", "adu");
		personRepository.save(p);
		
		Person dbp = personRepository.findByFirstname("ben");
		Assert.assertNotNull(dbp); 
		System.out.println(dbp.getFirstname() + ", " + dbp.getLastname());
	}

}
