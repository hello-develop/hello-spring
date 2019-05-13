package tech.changyan.hello.spring.ioc.xml.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import tech.changyan.hello.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestHelloBeanLifecycle extends UnitTestBase {

    public TestHelloBeanLifecycle(){
        super("classpath:spring-ioc-xml.xml");
    }

    @Test
    public void testBeanLifecycle(){
        super.getBean("helloBeanLifecycle");

    }



}
