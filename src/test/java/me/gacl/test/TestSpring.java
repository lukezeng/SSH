package me.gacl.test;

import me.gacl.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml", "spring-hibernate.xml");
        IUserService userService = (IUserService) ac.getBean("userService");
        userService.test();
    }
}