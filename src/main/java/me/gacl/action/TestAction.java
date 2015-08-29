package me.gacl.action;

import me.gacl.service.UserServiceI;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

@ParentPackage("basePackage")
@Action(value = "struts2Test")
@Namespace("/")
public class TestAction {

    /**
     * ×¢ÈëuserService
     */
    @Autowired
    private UserServiceI userService;

    public void test() {
        System.out.println("½øÈëTestAction");
        userService.test();
    }
}
