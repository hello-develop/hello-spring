package cn.znvis.hello.spring.ioc.xml.bean;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestHelloBeanLifecycle extends UnitTestBase {

    public TestHelloBeanLifecycle() {
        super("classpath:spring-ioc-xml.xml");
    }

    @Test
    public void testBeanLifecycle() {
        super.getBean("helloBeanLifecycle");

    }


}
