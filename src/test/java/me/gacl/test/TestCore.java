package me.gacl.test;

import me.gacl.model.User;
import me.gacl.service.IUserService;
import me.gacl.service.impl.UserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.UUID;

public class TestCore {

    private IUserService userService;

    /**
     * 这个before方法在所有的测试方法之前执行，并且只执行一次
     * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
     * 比如在before方法里面初始化ApplicationContext和userService
     */
    @Before
    public void before() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring-hibernate.xml"});
        userService = (IUserService) ac.getBean("userService");
    }

    @Test
    public void testSpring() {
        userService.test();
    }

    @Test
    public void testLog4j(){
        final Logger logger = Logger.getLogger(UserService.class);
        logger.debug("log debug");
        logger.info("log info");
        logger.warn("log warn");
        logger.error("log error");
    }

    //test for hibernate framework
    @Test
    public void testHibernate() {
        //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
        //UserServiceI userService = (UserServiceI) ac.getBean("userService");
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setName("abcd");
        user.setPwd("123");
        user.setCreatedatetime(new Date());
        userService.save(user);
    }
}