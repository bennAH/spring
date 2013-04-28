package com.sample.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is one of our DTOs. It is recognized by Hibernate as an entity by the @Entity
 * annotation. Other annotations provide further information to Hibernate about
 * how to map the Entity to a database tables.
 * 
 * @author dwolverton
 * 
 */
@Entity
public class Citizen {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Long id;
        String name;
        String job;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getJob() {
                return job;
        }

        public void setJob(String job) {
                this.job = job;
        }
        
        public Citizen() {}

        public Citizen(String name, String job) {
                this.name = name;
                this.job = job;
        }

}