package tech.changyan.hello.spring.aop.annotation.demo.concurrent;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Component;

@Component
public class ConcurrentDemo {

    public void normalConcurrent(){
        System.out.println("[HELLO] normal concurrent");
    }

    public void exceptionalConcurrent(){

        throw new PessimisticLockingFailureException("");

    }
}
