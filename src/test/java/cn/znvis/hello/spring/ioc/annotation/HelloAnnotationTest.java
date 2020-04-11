package cn.znvis.hello.spring.ioc.annotation;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

public class HelloAnnotationTest extends UnitTestBase {

    public HelloAnnotationTest() {
        super("spring-ioc-annotation.xml");
    }

    @Test
    public void printHello() {
        HelloAnnotation ha = super.getBean("helloAnnotation");
        ha.printHello();
    }
}