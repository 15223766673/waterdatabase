package com.example.config;

import com.example.domin.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    @ConditionalOnMissingBean(User.class)
    public User user()
    {
        return new User();
    }
}
