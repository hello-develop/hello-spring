package cn.znvis.hello.spring.ioc.java.injection.generics;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

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