package tech.changyan.hello.spring.ioc.annotation;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

public class HelloAnnotationTest extends UnitTestBase {

    public HelloAnnotationTest(){
        super("spring-ioc-annotation.xml");
    }

    @Test
    public void printHello() {
        HelloAnnotation ha = super.getBean("helloAnnotation");
        ha.printHello();
    }
}