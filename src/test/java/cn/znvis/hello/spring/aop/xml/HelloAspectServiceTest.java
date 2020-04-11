package cn.znvis.hello.spring.aop.xml;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

public class HelloAspectServiceTest extends UnitTestBase {

    public HelloAspectServiceTest() {
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