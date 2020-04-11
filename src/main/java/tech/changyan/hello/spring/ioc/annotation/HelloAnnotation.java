package tech.changyan.hello.spring.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class HelloAnnotation {

    public void printHello() {
        System.out.println("[HELLO] Hello Annotation");
    }
}
