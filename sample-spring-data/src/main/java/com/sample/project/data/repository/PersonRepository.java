package com.sample.project.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.project.data.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	public Person findByFirstname(String firstname);
}
