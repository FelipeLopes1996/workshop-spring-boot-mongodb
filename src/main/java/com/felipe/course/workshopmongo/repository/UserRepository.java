package com.felipe.course.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipe.course.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}