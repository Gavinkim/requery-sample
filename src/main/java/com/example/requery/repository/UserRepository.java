package com.example.requery.repository;

import com.example.requery.entity.User;
/**
 * @author gavin on 2018. 5. 1.
 */
public interface UserRepository {

    User findById(int id);
    User save(User user);
    void delete(User user);
    void delete(int id);
}
