package me.gacl.dao.impl;

import me.gacl.dao.IUserDao;
import me.gacl.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

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