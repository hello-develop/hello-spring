package cn.znvis.hello.spring.ioc.java.injection.generics;

import org.springframework.stereotype.Component;

@Component
public class HelloGenericsStringImpl implements HelloGenerics<String> {
    @Override
    public String info(String msg) {
        return msg;
    }
}
