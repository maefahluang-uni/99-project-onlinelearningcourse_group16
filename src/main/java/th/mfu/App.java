package th.mfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"th.mfu.auth" , "th.mfu.Controller" , "th.mfu.dto" , "th.mfu.Model" , "th.mfu.security", "service"})
@EnableJpaRepositories(basePackages = "th.mfu.Repository")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}