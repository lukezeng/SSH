package me.gacl.service.impl;

import org.springframework.stereotype.Service;
import me.gacl.service.UserServiceI;
//ʹ��Spring�ṩ��@Serviceע�⽫UserServiceImpl��עΪһ��Service
@Service("userService")
public class UserServiceImpl implements UserServiceI {
    
    public void test() {
        System.out.println("Hello World!");
    }

}