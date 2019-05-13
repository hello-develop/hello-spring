package tech.changyan.hello.spring.ioc.annotation.Bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelloBeanScope {

    public void printBeanScope(){
        System.out.println("[HELLO] bean Scope: " + this.hashCode());
    }
}
