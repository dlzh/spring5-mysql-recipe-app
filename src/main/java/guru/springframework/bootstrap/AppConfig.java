package guru.springframework.bootstrap;

import guru.springframework.services.UserDZService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {

    // Configuring a basic UserService bean
    @Bean
    public UserDZService userService() {
        return new UserDZService();
    }
}
