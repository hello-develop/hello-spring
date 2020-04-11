package tech.changyan.hello.spring.ioc.java.bean.config;

import org.springframework.stereotype.Component;

@Component
public class TestInit {

    public TestInit() {
        System.out.println("TestInit");
    }
}
