package cn.znvis.hello.spring.aop.xml.demo;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Component;

@Component
public class ConcurrentOperationDemo {

    public void normalInvoke() {
        System.out.println("[HELLO] normal invoke");
    }

    public void exceptionalInvoke() {

        throw new PessimisticLockingFailureException("");

    }
}
