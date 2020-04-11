package tech.changyan.hello.spring.ioc.xml.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import tech.changyan.hello.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestHelloBeanNameAware extends UnitTestBase {

    @Test
    public void testBeanNameAware() {
        System.out.println("[HELLO] Test bean Instance: " + super.getBean("helloBeanNameAware").hashCode());
    }
}
