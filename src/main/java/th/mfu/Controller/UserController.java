package th.mfu.Controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private final User user;

    public UserController(User user) {
         this.user = user;

 
    }
       @GetMapping("/register")
    public String newUser(Model model) {
        model.addAttribute("DtoUser", DtoUser());
        {
            return "register";
        }
     }
}