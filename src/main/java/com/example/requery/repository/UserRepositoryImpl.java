package com.example.requery.repository;

import com.example.requery.entity.User;
import com.example.requery.entity.UserEntity;
import io.requery.sql.EntityDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author gavin on 2018. 5. 1.
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private EntityDataStore userEntityDataStore;

    @Override
    public User findById(int id) {
        return (User)userEntityDataStore.findByKey(User.class,id);
    }

    @Override
    public User save(User user) {
        return (User)userEntityDataStore.upsert(user);
    }

    @Override
    public void delete(User user) {
        userEntityDataStore.delete(user);
    }

    @Override
    public void delete(int id) {
        userEntityDataStore.delete(User.class).where(UserEntity.ID.eq(id));
    }
}
