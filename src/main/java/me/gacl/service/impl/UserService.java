package me.gacl.service.impl;

import me.gacl.dao.impl.UserDao;
import me.gacl.model.User;
import me.gacl.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("userService")
public class UserService implements IUserService {

    private static final Logger logger = Logger.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    public void test() {
        logger.info("Hello World!");
    }

    public Serializable save(User user) {
        return userDao.save(user);
    }

}