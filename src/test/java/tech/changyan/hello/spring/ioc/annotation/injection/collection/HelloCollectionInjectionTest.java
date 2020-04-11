package tech.changyan.hello.spring.ioc.annotation.injection.collection;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

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