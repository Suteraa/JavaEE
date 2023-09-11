package cn.edu.ujn.ch1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
    @Autowired
    private IUserService userService;

    public void save() {
        userService.save();
        System.out.println("UserController.save()");
    }
}
