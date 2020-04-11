package tech.changyan.hello.spring.aop.xml.demo;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

public class ConcurrentOperationDemoTest extends UnitTestBase {

    public ConcurrentOperationDemoTest() {
        super("spring-aop-demo.xml");
    }

    @Test
    public void normalInvoke() {
        ConcurrentOperationDemo com = super.getBean("concurrentOperationDemo");
        com.normalInvoke();
    }

    @Test
    public void exceptionalInvoke() {
        ConcurrentOperationDemo com = super.getBean("concurrentOperationDemo");
        com.exceptionalInvoke();
    }
}