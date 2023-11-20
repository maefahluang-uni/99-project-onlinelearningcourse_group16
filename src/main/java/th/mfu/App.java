package th.mfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(scanBasePackages = {"th.mfu.Repository", "th.mfu.service.imp"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}