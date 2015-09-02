package me.gacl.action;

import com.opensymphony.xwork2.ModelDriven;
import me.gacl.model.User;
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
public class UserAction implements ModelDriven<User>{
    private static final Logger logger = Logger.getLogger(UserAction.class);
    User user = new User();

    @Autowired
    private IUserService userService;

    public User getModel(){
        return user;
    }

    public void register(){
        logger.warn(user.getName() + ", 111" + user.getPwd());
        userService.test();
    }
}
