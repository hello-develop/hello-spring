package tech.changyan.hello.spring.aop.xml;

import org.springframework.stereotype.Service;

@Service
public class HelloAspectService {

    public void hello(){
        System.out.println("[HELLO] HelloAspectService say hello");

        throw new RuntimeException();
    }

    public void hello(String name, int age){
        System.out.println("[HELLO] HelloAspectService say hello again: " + name + " " + age);
    }
}
