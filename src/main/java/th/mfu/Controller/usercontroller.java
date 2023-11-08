package th.mfu.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class usercontroller {
    @RequestMapping("/login")
    public String login() {
        return "login ";
    }
}
