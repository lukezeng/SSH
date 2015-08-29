package me.gacl.test;

import me.gacl.service.UserServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        UserServiceI userService = (UserServiceI) ac.getBean("userService");
        userService.test();
    }
}