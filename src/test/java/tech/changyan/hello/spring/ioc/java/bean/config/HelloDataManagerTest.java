package tech.changyan.hello.spring.ioc.java.bean.config;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

public class HelloDataManagerTest extends UnitTestBase {

    public HelloDataManagerTest(){
        super("spring-ioc-java.xml");
    }

    @Test
    public void hello() {
        HelloDataManager helloDataManager = super.getBean("helloDataManager");
        System.out.println("[HELLO] class: " + helloDataManager.getClass().getName());
    }

}