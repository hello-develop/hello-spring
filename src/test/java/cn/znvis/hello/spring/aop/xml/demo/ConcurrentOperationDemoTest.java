package cn.znvis.hello.spring.aop.xml.demo;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

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