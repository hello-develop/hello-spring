package tech.changyan.hello.spring.ioc.annotation.Bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import tech.changyan.hello.spring.base.UnitTestBase;

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