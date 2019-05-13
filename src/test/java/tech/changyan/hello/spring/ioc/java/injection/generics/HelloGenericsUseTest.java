package tech.changyan.hello.spring.ioc.java.injection.generics;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

public class HelloGenericsUseTest extends UnitTestBase {

//    public HelloGenericsUseTest(){
//        super("spring-ioc-annotation.xml");
//    }

    @Test
    public void useGenericisString() {
        HelloGenericsUse helloGenericsUse = super.getBean("helloGenericsUse");
        helloGenericsUse.useGenericsString("cccc");
    }

    @Test
    public void useGenericsInteger() {
        HelloGenericsUse helloGenericsUse = super.getBean("helloGenericsUse");
        helloGenericsUse.useGenericsInteger(6666);
    }
}