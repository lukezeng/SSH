package me.gacl.test;

import me.gacl.service.UserServiceI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test() {
        //ͨ��spring.xml�����ļ�����Spring��Ӧ�ó��������Ļ���
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //��Spring��IOC�����л�ȡbean����
        UserServiceI userService = (UserServiceI) ac.getBean("userService");
        //ִ�в��Է���
        userService.test();
    }
}