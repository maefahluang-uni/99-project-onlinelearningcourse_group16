package th.mfu.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @RequestMapping("/")
    public String Register() {
        return "register";
    }
}
