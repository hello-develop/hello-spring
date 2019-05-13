package tech.changyan.hello.spring.aop.xml;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

public class HelloAspectServiceTest extends UnitTestBase {

    public HelloAspectServiceTest(){
        super("spring-aop-xml.xml");
    }

    @Test
    public void hello() {
        HelloAspectService has = super.getBean("helloAspectService");
        has.hello();
    }

    @Test
    public void hello1() {
        HelloAspectService has = super.getBean("helloAspectService");
        has.hello("cc", 19);
    }
}