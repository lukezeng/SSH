package me.gacl.service.impl;

import me.gacl.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService implements IUserService {

    private final static Logger logger = Logger.getLogger(UserService.class);

    public void test() {
        logger.info("Hello World");
    }

}