package tech.changyan.hello.spring.ioc.xml.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import tech.changyan.hello.spring.base.UnitTestBase;
import tech.changyan.hello.spring.ioc.xml.injection.service.HelloInjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestHelloInjection extends UnitTestBase {

    public TestHelloInjection(){
        super("classpath:spring-ioc-xml.xml");
    }

    @Test
    public void testSetter(){
        HelloInjectionService service = super.getBean("helloInjectionService");
        service.save("cc");
    }

    @Test
    public void testConstrctor(){
        HelloInjectionService service = super.getBean("helloInjectionService");
        service.save("cc");
    }
}
