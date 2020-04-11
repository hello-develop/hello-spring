package cn.znvis.hello.spring.aop.annotation.demo.concurrent;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

public class ConcurrentDemoTest extends UnitTestBase {

    public ConcurrentDemoTest() {
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