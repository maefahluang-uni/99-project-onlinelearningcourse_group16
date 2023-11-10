package th.mfu.Controller;

import org.apache.catalina.User;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import th.mfu.Repository.UserRepository;

@RestController
public class UserController {
    @GetMapping("/register")
    public String getRegpeg(@ModelAttribute("user") User user) {
        return "register";
    }

    @PostMapping(value = "/register")
    public String saveUser(@ModelAttribute("user") User user, Model model) {
        UserRepository.save(user);
        model.addAttribute("message", "submit");
        return "register";

//odpsa
    }
}
