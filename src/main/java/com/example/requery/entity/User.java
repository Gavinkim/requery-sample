package com.example.requery.entity;


import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;
import io.requery.Table;
/**
 * @author gavin on 2018. 5. 1.
 */
@Entity
@Table(name = "USER")
public class User {

    @Key
    int id;
    String name;
    String email;
    int age;

    public User(){}
    public User(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
