package th.mfu.Controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class usercontroller {
    @RequestMapping("/login")
    public String login() {
        return "login ";
    }
}
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> 308dd9e (ploy1)
