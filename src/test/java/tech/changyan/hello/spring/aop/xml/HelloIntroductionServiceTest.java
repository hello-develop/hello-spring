package tech.changyan.hello.spring.aop.xml;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

public class HelloIntroductionServiceTest extends UnitTestBase {

    public HelloIntroductionServiceTest(){
        super("spring-aop-xml.xml");
    }

    @Test
    public void hello() {
        HelloIntroduction hi = (HelloIntroduction) super.getBean("helloIntroductionService");
        hi.hello();
    }
}