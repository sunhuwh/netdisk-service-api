package com.shw.netdisk.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shw.netdisk.domain.User;

public interface UserRepository  extends MongoRepository<User, String>{

}
