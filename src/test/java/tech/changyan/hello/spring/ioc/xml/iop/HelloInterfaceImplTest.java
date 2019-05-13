package tech.changyan.hello.spring.ioc.xml.iop;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

public class HelloInterfaceImplTest extends UnitTestBase {

    @Test
    public void hello() {
        HelloInterface hif = super.getBean("helloInterface");
        hif.hello("cc");
    }
}