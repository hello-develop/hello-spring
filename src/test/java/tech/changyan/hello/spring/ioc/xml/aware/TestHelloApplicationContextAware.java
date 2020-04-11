package tech.changyan.hello.spring.ioc.xml.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import tech.changyan.hello.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestHelloApplicationContextAware extends UnitTestBase {

    @Test
    public void testApplicationContextAware() {
        System.out.println("[HELLO] HelloApplicationContext: " + super.getBean("helloApplicationContextAware").hashCode());
    }

    @Test
    public void testApplicationContext() {
        HelloApplicationContextAware aca = super.getBean("helloApplicationContextAware");
        aca.hello();
    }
}
