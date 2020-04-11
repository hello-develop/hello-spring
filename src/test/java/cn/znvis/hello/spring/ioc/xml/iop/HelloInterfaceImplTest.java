package cn.znvis.hello.spring.ioc.xml.iop;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

public class HelloInterfaceImplTest extends UnitTestBase {

    @Test
    public void hello() {
        HelloInterface hif = super.getBean("helloInterface");
        hif.hello("cc");
    }
}