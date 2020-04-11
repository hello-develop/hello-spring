package cn.znvis.hello.spring.aop.xml;

import org.springframework.stereotype.Component;

@Component
public class HelloIntroductionImpl implements HelloIntroduction {
    @Override
    public void hello() {
        System.out.println("[HELLO] HelloIntroductionImpl say hello");
    }
}
