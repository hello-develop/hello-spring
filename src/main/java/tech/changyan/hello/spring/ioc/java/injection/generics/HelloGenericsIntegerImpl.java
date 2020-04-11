package tech.changyan.hello.spring.ioc.java.injection.generics;

public class HelloGenericsIntegerImpl implements HelloGenerics<Integer> {
    @Override
    public Integer info(Integer msg) {
        return msg;
    }
}
