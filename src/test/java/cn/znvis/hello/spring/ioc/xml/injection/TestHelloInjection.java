package cn.znvis.hello.spring.ioc.xml.injection;

import cn.znvis.hello.spring.base.UnitTestBase;
import cn.znvis.hello.spring.ioc.xml.injection.service.HelloInjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestHelloInjection extends UnitTestBase {

    public TestHelloInjection() {
        super("classpath:spring-ioc-xml.xml");
    }

    @Test
    public void testSetter() {
        HelloInjectionService service = super.getBean("helloInjectionService");
        service.save("cc");
    }

    @Test
    public void testConstrctor() {
        HelloInjectionService service = super.getBean("helloInjectionService");
        service.save("cc");
    }
}
