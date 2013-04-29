package com.sample.project.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.project.data.model.Post;



public interface PostRepository extends JpaRepository<Post, Integer> {

}
