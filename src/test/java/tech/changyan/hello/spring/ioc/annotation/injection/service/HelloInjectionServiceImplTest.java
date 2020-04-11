package tech.changyan.hello.spring.ioc.annotation.injection.service;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

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