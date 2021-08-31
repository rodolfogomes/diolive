package com.dio.live.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter @Setter
public class DbConfig {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String showDevDatabaseConfig(){
        System.out.println("DEV connection");
        System.out.println(driverClassName);
        System.out.println(url);
        return "Dev connection up!";
    }

    @Profile("prod")
    @Bean
    public String showProdDatabaseConfig(){
        System.out.println("DEV connection");
        System.out.println(driverClassName);
        System.out.println(url);
        return "Poduction connection up!";
    }
}
