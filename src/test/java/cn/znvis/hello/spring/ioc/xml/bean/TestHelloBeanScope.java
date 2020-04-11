package cn.znvis.hello.spring.ioc.xml.bean;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

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
