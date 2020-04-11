package cn.znvis.hello.spring.ioc.annotation.injection.collection;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

public class HelloCollectionInjectionTest extends UnitTestBase {

    public HelloCollectionInjectionTest() {
        super("spring-ioc-annotation.xml");
    }

    @Test
    public void traversal() {
        HelloCollectionInjection helloCollectionInjection = super.getBean("helloCollectionInjection");
        helloCollectionInjection.traversal();
    }
}