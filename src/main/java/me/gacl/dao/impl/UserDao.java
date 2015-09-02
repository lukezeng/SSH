package me.gacl.dao.impl;

import me.gacl.dao.IUserDao;
import me.gacl.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("userDao")
public class UserDao extends BaseDao<User> implements IUserDao {
    
}