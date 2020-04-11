package cn.znvis.hello.spring.ioc.annotation.injection.service;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

public class HelloInjectionServiceImplTest extends UnitTestBase {

    public HelloInjectionServiceImplTest() {
        super("spring-ioc-annotation.xml");
    }

    @Test
    public void save() {
        HelloInjectionService his = super.getBean("helloInjectionServiceImpl");
        his.save("cc");
    }
}