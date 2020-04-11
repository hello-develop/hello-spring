package cn.znvis.hello.spring.ioc.xml.aware;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

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
