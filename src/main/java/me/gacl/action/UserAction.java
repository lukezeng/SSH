package me.gacl.action;

import me.gacl.service.IUserService;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;


@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "userAction")
public class UserAction {
    private static final Logger logger = Logger.getLogger(UserAction.class);

    @Autowired
    private IUserService userService;

    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void register(){
        logger.warn(name + ", " + pwd);
        userService.test();
    }
}
