package th.mfu.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Commrnt test
@RestController

public class UserController {
    @GetMapping
    @RequestMapping("/login")
    public String login() {
        model.addAttributes("user",user);
        return "newlogin"

    }

}