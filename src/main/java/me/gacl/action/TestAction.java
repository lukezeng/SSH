package me.gacl.action;
import me.gacl.service.UserServiceI;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

@ParentPackage("basePackage")
@Action(value="struts2Test")//ʹ��convention-plugin����ṩ��@Actionע�⽫һ����ͨjava���עΪһ�����Դ����û������Action��Action������Ϊstruts2Test
@Namespace("/")//ʹ��convention-plugin����ṩ��@Namespaceע��Ϊ���Actionָ��һ�������ռ�
public class TestAction {

    /**
     * ע��userService
     */
    @Autowired
    private UserServiceI userService;

    public void test() {
        System.out.println("����TestAction");
        userService.test();
    }
}
