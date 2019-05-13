package tech.changyan.hello.spring.aop.annotation.demo.concurrent;

import org.junit.Test;
import tech.changyan.hello.spring.aop.annotation.demo.concurrent.ConcurrentDemo;
import tech.changyan.hello.spring.base.UnitTestBase;

public class ConcurrentDemoTest extends UnitTestBase {

    public ConcurrentDemoTest(){
        super("spring-aop-annotation.xml");
    }

    @Test
    public void normalConcurrent() {
        ConcurrentDemo concurrentDemo = super.getBean("concurrentDemo");
        concurrentDemo.normalConcurrent();
    }

    @Test
    public void exceptionalConcurrent() {
        ConcurrentDemo concurrentDemo = super.getBean("concurrentDemo");
        concurrentDemo.exceptionalConcurrent();
    }
}