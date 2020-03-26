package com.javaspringdatarestendpoint.javaspringdatarest.entities;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
