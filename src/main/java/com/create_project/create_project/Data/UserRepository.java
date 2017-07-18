package com.create_project.create_project.Data;

import com.create_project.create_project.Entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by CMONCHICOURT on 18/07/2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
