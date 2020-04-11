package tech.changyan.hello.spring.ioc.xml.iop;

public class HelloInterfaceImpl implements HelloInterface {
    @Override
    public String hello(String word) {
        return "[HELLO] Word from interface [HelloInterface]:" + word;
    }
}
