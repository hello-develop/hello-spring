package tech.changyan.hello.spring.ioc.java.bean.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring-ioc-java.xml")
public class HelloAppConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public HelloDataManager helloDataManager(){
        return new HelloDataManager(url, username, password);
    }

}
