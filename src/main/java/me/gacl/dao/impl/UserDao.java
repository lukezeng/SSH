package me.gacl.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.gacl.dao.IUserDao;
import me.gacl.model.User;

@Repository("userDao")
public class UserDao implements IUserDao {

    /**
     * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
     */
    @Autowired
    private SessionFactory sessionFactory;

    public Serializable save(User user) {
        return sessionFactory.getCurrentSession().save(user);
    }
}