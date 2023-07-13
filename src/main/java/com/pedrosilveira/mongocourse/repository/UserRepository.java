package com.pedrosilveira.mongocourse.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pedrosilveira.mongocourse.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}