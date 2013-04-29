package com.sample.project.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="person")
public class Person {
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="pid")
    private Long pid;
    
    @Column(name="first_name")
    private String firstname;
    
    @Column(name="last_name")
    private String lastname;
    
//    @Column(name="date_created")
//    @Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
//    private DateTime dateCreated;
    
    public Person() {}
    
    public Person(String firstname, String lastname) {
    	this.firstname = firstname;
    	this.lastname = lastname;
    }
 
    public Long getPid() {
        return pid;
    }
 
    public void setPid(Long pid) {
        this.pid = pid;
    }
 
    public String getFirstname() {
        return firstname;
    }
 
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
    	this.lastname = lastname;
    }
}

