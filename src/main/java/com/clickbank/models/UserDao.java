package com.clickbank.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


/**
 * Created by riveramoreira on 7/10/16.
 */

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    public User findByEmail(String email);
    public User findByEmailAndPassword(String email, String password);

}
