package me.gacl.dao.impl;

import me.gacl.dao.IBaseDao;
import me.gacl.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/9/2.
 */
public class BaseDao<T> implements IBaseDao<T>{
    /**
     * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
     */
    /**
     * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
     */
    @Autowired
    private SessionFactory sessionFactory;

    public Serializable save(T o) {
        return sessionFactory.getCurrentSession().save(o);
    }
}
