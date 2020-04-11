package cn.znvis.hello.spring.ioc.annotation.Bean;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class HelloBeanScopeTest extends UnitTestBase {

    public HelloBeanScopeTest() {
        super("spring-ioc-annotation.xml");
    }

    @Test
    public void printBeanScope() {
        HelloBeanScope hbs = super.getBean("helloBeanScope");
        hbs.printBeanScope();

        HelloBeanScope hbs2 = super.getBean("helloBeanScope");
        hbs2.printBeanScope();
    }
}