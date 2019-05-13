package tech.changyan.hello.spring.ioc.java.injection.generics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloGenericsUse {

    @Autowired
    private HelloGenerics<Integer> helloGenericsInteger;
    @Autowired
    private HelloGenerics<String> helloGenericsString;

    public void useGenericsString(String msg){
        System.out.println("[HELLO] Use String: " + this.helloGenericsString.info(msg));
    }

    public void useGenericsInteger(Integer msg){
        System.out.println("[HELLO] Use Integer: " + this.helloGenericsInteger.info(msg));
    }
}
