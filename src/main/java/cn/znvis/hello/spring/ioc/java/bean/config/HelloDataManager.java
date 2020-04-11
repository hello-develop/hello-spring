package cn.znvis.hello.spring.ioc.java.bean.config;

import org.springframework.stereotype.Component;

@Component
public class HelloDataManager {

    public HelloDataManager(String url, String username, String password) {
        System.out.println("[HELLO] url: " + url);
        System.out.println("[HELLO] username: " + username);
        System.out.println("[HELLO] password: " + password);
    }

}
