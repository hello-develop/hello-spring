package tech.changyan.hello.spring.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class HelloAspect {

    public void before(){
        System.out.println("[HELLO] HelloAspect before");
    }

    public void afterReturning(){
        System.out.println("[HELLO] HelloAspect after returning");
    }

    public void afterThrowing(){
        System.out.println("[HELLO] HelloAspect after throwing");
    }

    public void after(){
        System.out.println("[HELLO] HelloAspect after");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object obj = null;

        System.out.println("[HELLO] HelloAspect around 1");
        obj = pjp.proceed();
        System.out.println("[HELLO] HelloAspect around 2");

        return obj;
    }

    public Object aroundParams(ProceedingJoinPoint pjp, String name, int age) throws Throwable{
        Object obj = null;

        System.out.println("[HELLO] HelloAspect aroundParams 1: " + name + " " + age);
        obj = pjp.proceed();
        System.out.println("[HELLO] HelloAspect aroundParams 2: " + name + " " + age);

        return obj;
    }

}
