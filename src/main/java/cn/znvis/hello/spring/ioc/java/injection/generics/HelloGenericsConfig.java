package cn.znvis.hello.spring.ioc.java.injection.generics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloGenericsConfig {

    //    @bean
//    public HelloGenericsStringImpl helloGenericsStringImpl(){
//        return new HelloGenericsStringImpl();
//    }
//
    @Bean
    public HelloGenericsIntegerImpl helloGenericsIntegerImpl() {
        return new HelloGenericsIntegerImpl();
    }

}
