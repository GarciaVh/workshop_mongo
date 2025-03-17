package org.garcia.workshopsitemongo.repository;

import org.garcia.workshopsitemongo.config.Instantiation;
import org.garcia.workshopsitemongo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
