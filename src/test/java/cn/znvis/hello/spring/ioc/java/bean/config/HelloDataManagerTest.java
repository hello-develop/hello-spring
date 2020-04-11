package cn.znvis.hello.spring.ioc.java.bean.config;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

public class HelloDataManagerTest extends UnitTestBase {

    public HelloDataManagerTest() {
        super("spring-ioc-java.xml");
    }

    @Test
    public void hello() {
        HelloDataManager helloDataManager = super.getBean("helloDataManager");
        System.out.println("[HELLO] class: " + helloDataManager.getClass().getName());
    }

}