package me.gacl.service.impl;

import me.gacl.service.UserServiceI;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

    public void test() {
        System.out.println("Hello World!");
    }

}