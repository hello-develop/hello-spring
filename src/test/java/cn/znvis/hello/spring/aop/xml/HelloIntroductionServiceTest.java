package cn.znvis.hello.spring.aop.xml;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

public class HelloIntroductionServiceTest extends UnitTestBase {

    public HelloIntroductionServiceTest() {
        super("spring-aop-xml.xml");
    }

    @Test
    public void hello() {
        HelloIntroduction hi = (HelloIntroduction) super.getBean("helloIntroductionService");
        hi.hello();
    }
}