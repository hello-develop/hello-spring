package tech.changyan.hello.spring.ioc.xml.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import tech.changyan.hello.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestHelloBeanScope extends UnitTestBase {

    public TestHelloBeanScope() {
        super("classpath:spring-ioc-xml.xml");
    }

    @Test
    public void testPrintBeanScope() {
        HelloBeanScope bs = super.getBean("helloBeanScope");
        bs.printBeanScope();

        HelloBeanScope bs2 = super.getBean("helloBeanScope");
        bs2.printBeanScope();

    }
}
