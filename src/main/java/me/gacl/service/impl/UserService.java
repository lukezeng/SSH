package me.gacl.service.impl;

import me.gacl.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService implements IUserService {

    public void test() {
        System.out.println("Hello World!");
    }

}